package com.cqmrjb.dao.appScope;

import com.cqmrjb.entity.appScope.AppScope;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface AppScopeDao {
    List <AppScope> selectAppScope(Map map);

}
