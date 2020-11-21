package com.cqmrjb.service.appCategory;

import com.cqmrjb.entity.appCategory.AppCategory;

import java.util.List;
import java.util.Map;

public interface AppCategoryService {
    List<AppCategory> selectAppCategory(Map map);
}
