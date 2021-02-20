package com.cqmrjb.dao.appMenu;

import com.cqmrjb.entity.appMenu.AppMenuConent;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface AppMenuConentDao {
    int addAppContent(Map map);
    List<AppMenuConent> selectAppContent(Map map);

    int updateAppContent(Map map);

}
