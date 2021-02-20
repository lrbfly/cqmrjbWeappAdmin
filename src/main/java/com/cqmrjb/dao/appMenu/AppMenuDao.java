package com.cqmrjb.dao.appMenu;

import com.cqmrjb.entity.appMenu.AppMenu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface AppMenuDao {
    int addAppMenu(Map map);
    List<AppMenu> selectAppMenu(Map map);
    int updateAppMenu(Map map);

}
