package com.cqmrjb.entity.appScope;

public class AppScope {
    private Integer id;
    private String appScope;
    private Integer status;
    private String insertTime;
    private Integer is_delete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppScope() {
        return appScope;
    }

    public void setAppScope(String appScope) {
        this.appScope = appScope;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }

    public Integer getCreatUserId() {
        return creatUserId;
    }

    public void setCreatUserId(Integer creatUserId) {
        this.creatUserId = creatUserId;
    }

    private Integer creatUserId;
}
