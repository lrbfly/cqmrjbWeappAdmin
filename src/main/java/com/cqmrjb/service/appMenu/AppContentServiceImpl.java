package com.cqmrjb.service.appMenu;

import com.cqmrjb.dao.appMenu.AppMenuConentDao;
import com.cqmrjb.entity.appMenu.AppMenuConent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AppContentServiceImpl implements AppContentService {
    @Autowired
    private AppMenuConentDao appMenuConent;

    public Map<String,Object> addAppContent(Map map){
        Map<String,Object> result = new HashMap<>();
        int num = appMenuConent.addAppContent(map);
        if(num>0){
            result.put("msg","操作成功");
        }else{
            result.put("msg","操作失败");
        }
        result.put("code",200);
        return result;
    }

    public Map<String,Object> selectAppContent(Map map){
        Map<String,Object> result = new HashMap<>();
        List<AppMenuConent> list = appMenuConent.selectAppContent(map);
        for (int i=0,l=list.size();i<l;i++){
            list.get(i).getAppCategory_id();
        }
        result.put("data",list);
        result.put("code",200);
        return result;
    }

    public Map<String,Object> updateAppContent(Map map){
        Map<String,Object> result = new HashMap<>();
        int num = appMenuConent.updateAppContent(map);
        if(num>0){
            result.put("msg","操作成功");
        }else{
            result.put("msg","操作失败");
        }
        result.put("code",200);
        return result;
    }

}
