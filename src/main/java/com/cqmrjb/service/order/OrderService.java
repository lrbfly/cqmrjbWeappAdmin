package com.cqmrjb.service.order;

import java.util.Map;

public interface OrderService {
    Map<String,Object> selectOrder(Map map); //查询订单
    Map<String,Object> addOrder(Map map); //新增订单
    Map<String,Object> updataOrder(Map map); //修改订单
}
