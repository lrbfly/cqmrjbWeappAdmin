package com.cqmrjb.service.appScope;

import com.cqmrjb.dao.appScope.AppScopeDao;
import com.cqmrjb.entity.appCategory.AppCategory;
import com.cqmrjb.entity.appScope.AppScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AppScopeServiceImpl implements AppScopeService{
    @Autowired
    private AppScopeDao appScopeDao;

    public Map<String,Object> selectAppScope(Map map){
        Map<String,Object> result = new HashMap<>();
        List<AppScope> list =  new ArrayList<>();
        map.put("status",1);
        list = appScopeDao.selectAppScope(map);
        //判断 查询数据 是否为空
        if(list.size()>0){
            result.put("code",200);
            result.put("msg", "操作成功");
            result.put("data",list);
        }else{
            result.put("code",200);
            result.put("msg", "没有数据...");
            result.put("data",list);
        }
        return result;
    }
}
