package com.cqmrjb.dao.appCategory;

import com.cqmrjb.entity.appCategory.AppCategory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface AppCategoryDao {
    List<AppCategory> selectAppCategory(Map map);
}
