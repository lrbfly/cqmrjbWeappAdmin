package com.cqmrjb.entity.appMenu;

public class AppMenuConent {
    private  Integer id;
    private  String title;
    private  String content;
    private  String banner;
    private  String insertTime;
    private  Integer creat_user;
    private  Integer is_delete;
    private  Integer menu_id;
    private  String  comment;
    private  Integer appCategory_id;

    public Integer getAppCategory_id() {
        return appCategory_id;
    }

    public void setAppCategory_id(Integer appCategory_id) {
        this.appCategory_id = appCategory_id;
    }



    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }

    public Integer getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(Integer menu_id) {
        this.menu_id = menu_id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }

    public Integer getCreat_user() {
        return creat_user;
    }

    public void setCreat_user(Integer creat_user) {
        this.creat_user = creat_user;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    private  Integer status;
}
