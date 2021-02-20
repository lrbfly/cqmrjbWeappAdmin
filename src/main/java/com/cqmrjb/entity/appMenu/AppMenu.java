package com.cqmrjb.entity.appMenu;

public class AppMenu {
    Integer id;
    String menu_name;
    String menu_status;
    String creat_time;
    Integer is_delete;
    Integer creat_user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenu_name() {
        return menu_name;
    }

    public void setMenu_name(String menu_name) {
        this.menu_name = menu_name;
    }

    public String getMenu_status() {
        return menu_status;
    }

    public void setMenu_status(String menu_status) {
        this.menu_status = menu_status;
    }

    public String getCreat_time() {
        return creat_time;
    }

    public void setCreat_time(String creat_time) {
        this.creat_time = creat_time;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }

    public Integer getCreat_user() {
        return creat_user;
    }

    public void setCreat_user(Integer creat_user) {
        this.creat_user = creat_user;
    }
}
