package com.cqmrjb.dao.app;

import com.cqmrjb.entity.app.WxApp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface WxAppDao {
    int addApp(Map map);
    List<WxApp> selectApp(Map map);
    int updateApp(Map map);
}
