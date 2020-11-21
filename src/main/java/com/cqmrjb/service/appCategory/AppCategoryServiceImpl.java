package com.cqmrjb.service.appCategory;

import com.cqmrjb.dao.appCategory.AppCategoryDao;
import com.cqmrjb.entity.appCategory.AppCategory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class AppCategoryServiceImpl implements AppCategoryService {
    @Resource
    private AppCategoryDao appCategoryDao;

    public List<AppCategory> selectAppCategory(Map map){
        map.put("status",1);
        List<AppCategory>  list = appCategoryDao.selectAppCategory(map);
        return list;
    }
}
