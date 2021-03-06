package com.cqmrjb.service.appCategory;

import com.cqmrjb.dao.appCategory.AppCategoryDao;
import com.cqmrjb.entity.appCategory.AppCategory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AppCategoryServiceImpl implements AppCategoryService {
    @Resource
    private AppCategoryDao appCategoryDao;

    public Map<String,Object> selectAppCategory(Map map){
        Map<String,Object> result = new HashMap<>();
        map.put("status",1);
        List<AppCategory>  list = appCategoryDao.selectAppCategory(map);
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
