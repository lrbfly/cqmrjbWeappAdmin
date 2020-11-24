package com.cqmrjb.service.app;

import com.cqmrjb.dao.app.WxAppDao;
import com.cqmrjb.dao.appCategory.AppCategoryDao;
import com.cqmrjb.dao.appScope.AppScopeDao;
import com.cqmrjb.entity.app.WxApp;
import com.cqmrjb.entity.appCategory.AppCategory;
import com.cqmrjb.entity.appScope.AppScope;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.util.ArrayUtils;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WxAppServiceImpl implements WxAppService {
    @Resource
    private WxAppDao wxAppDao;
    @Resource
    private AppCategoryDao appCategoryDao;
    @Autowired
    private AppScopeDao appScopeDao;

    @Override
    public Map<String,Object> addApp(Map map){
        Map<String,Object> result = new HashMap<>();
        List<WxApp> list = new ArrayList<>();

        int num = wxAppDao.addApp(map);
        if(num==1){
            Map<String,Object> params = new HashMap<>();
            params.put("is_delete",1);// 默认查询 is_delete 为 1 的
            list = wxAppDao.selectApp(params);
            result.put("msg","操作成功");
        }else{
            result.put("msg","操作失败");
        }
        result.put("data",list);
        result.put("code",200);
        return  result;
    }
    @Override
    public Map<String,Object> selectApp(Map map){
        map.put("is_delete",1);// 默认查询 is_delete 为 1 的
        List<WxApp> list = wxAppDao.selectApp(map);
        Map<String,Object> result = new HashMap<>();

        //判断 查询数据 是否为空
        if(list.size()>0){

            result.put("code",200);
            result.put("msg", "操作成功");
            result.put("data",listMap(list));
        }else{
            result.put("code",200);
            result.put("msg", "没有数据...");
            result.put("data",list);
        }
        return result;
    }

    @Override
    public Map<String,Object> updateApp(Map map){
        Map<String,Object> result = new HashMap<>();
        List<WxApp> list = new ArrayList<>();

        // 获取 appCategory 参数 toString 再存入数据库
        if(map.get("appCategory") !=null){
            ArrayList srr = (ArrayList)map.get("appCategory");
            map.put("appCategory",ArrayToSting(srr));
        }

        // 获取 appScope 参数 toString 再存入数据库
        if(map.get("appScope") !=null){
            ArrayList srr = (ArrayList)map.get("appScope");

            map.put("appScope",ArrayToSting(srr));
        }

        int num = wxAppDao.updateApp(map);
        if(num>0){
            Map<String,Object> params = new HashMap<>();
            params.put("is_delete",1);// 默认查询 is_delete 为 1 的
            list = wxAppDao.selectApp(params);
            result.put("msg","操作成功");
        }else{
            result.put("msg","操作失败");
        }
        result.put("data",listMap(list));
        result.put("code",200);
        return  result;
    }

    //返回 listMap数据
    public List<Map> listMap(List<WxApp> list){
        List<Map> mapList = new ArrayList<>();
        if(list==null){
            return null;
        }
        //循环 查询数据 list
        for(WxApp wxApp : list){
            //组装 前端业务需要map
            Map<String,Object> wxAppMap = new HashMap<>();
            String appCategoryStr1 = ""; //拼接 维修设备 字符串
            String appScopetr1 = ""; //拼接 维修范围 字符串
            wxAppMap.put("wxApp",wxApp);

            if(wxApp.getAppCategory() !=null){
                //维修设备 为复选框 数组格式
                String [] appCategoryStr = wxApp.getAppCategory().split(",");
                //循环 id 查找 对应设备
                for(int i=0,l=appCategoryStr.length;i<l;i++){
                    Map<String,Object> params = new HashMap<>();
                    params.put("id",appCategoryStr[i]);
                    List<AppCategory> appCategoryList = appCategoryDao.selectAppCategory(params);
                    appCategoryStr1+=appCategoryList.get(0).getAppCategory()+" ";
                }
                wxApp.setAppCategory(appCategoryStr1);

                wxAppMap.put("appCategory",appCategoryStr);
            }else{
                wxAppMap.put("appCategory",null);
            }

            if(wxApp.getAppScope() !=null){
                //维修范围 为复选框 数组格式
                String [] appScopeStr = wxApp.getAppScope().split(",");
                //循环 id 查找 对应设备
                for(int i=0,l=appScopeStr.length;i<l;i++){
                    Map<String,Object> params = new HashMap<>();
                    params.put("id",appScopeStr[i]);
                    List<AppScope> appScopeList = appScopeDao.selectAppScope(params);
                    appScopetr1+=appScopeList.get(0).getAppScope()+" ";
                }
                wxApp.setAppScope(appScopetr1);

                wxAppMap.put("appScope",appScopeStr);
            }else{
                wxAppMap.put("appScope",null);
            }

            mapList.add(wxAppMap);
        }
        return mapList;
    }

    //Array转化成 String
    public String ArrayToSting (ArrayList arrayList){
        String Strr = "";

            if(arrayList.size()>1){
                for(int i=0,l=arrayList.size();i<l;i++){
                    if(i != l-1){
                        Strr+=arrayList.get(i).toString()+",";
                    }else{
                        Strr+=arrayList.get(i).toString();
                    }
                }
            }else{
                Strr = arrayList.get(0).toString();
            }

        return Strr;
    }

}
