package com.cqmrjb.service.appMenu;

import com.cqmrjb.dao.appMenu.AppMenuDao;
import com.cqmrjb.entity.appMenu.AppMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class AppMenuServiceImpl implements AppMenuService{
    @Autowired
    private AppMenuDao appMenuDao;
    public Map<String,Object> addAppMenu(Map map){
        Map<String,Object> result = new HashMap<>();
        int num = appMenuDao.addAppMenu(map);
        if(num>0){
            result.put("msg","操作成功");
        }else{
            result.put("msg","操作失败");
        }
        result.put("code",200);
        return result;
    }

    public Map<String,Object> selectAppMenu(Map map){
        Map<String,Object> result = new HashMap<>();
        List<AppMenu> list = appMenuDao.selectAppMenu(map);
        result.put("msg","操作成功");
        result.put("data",list);
        result.put("code",200);
        return result;
    }


    public Map<String,Object> updateAppMenu(Map map){
        Map<String,Object> result = new HashMap<>();
        int num = appMenuDao.updateAppMenu(map);
        if(num>0){
            result.put("msg","操作成功");
        }else{
            result.put("msg","操作失败");
        }
        result.put("code",200);
        return result;
    }
}
