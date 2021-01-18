package com.cqmrjb.entity.order;

public class Order {
    private int id;
    private String phone;
    private String address;
    private int type;
    private int electrical;
    private String create_time;
    private int orde_type;
    private String update_time;
    private String order_source;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getElectrical() {
        return electrical;
    }

    public void setElectrical(int electrical) {
        this.electrical = electrical;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public int getOrde_type() {
        return orde_type;
    }

    public void setOrde_type(int orde_type) {
        this.orde_type = orde_type;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public String getOrder_source() {
        return order_source;
    }

    public void setOrder_source(String order_source) {
        this.order_source = order_source;
    }

    public int getOrder_status() {
        return order_status;
    }

    public void setOrder_status(int order_status) {
        this.order_status = order_status;
    }

    private int order_status;

}
