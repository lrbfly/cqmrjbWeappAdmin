package com.cqmrjb.service.order;


import com.cqmrjb.dao.order.OrderDao;
import com.cqmrjb.entity.order.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService{

    @Autowired
    private OrderDao orderDao;

    public Map<String,Object> selectOrder(Map map){
        Map<String,Object> result = new HashMap<>();
        List<Order> list =  new ArrayList<>();
        map.put("order_status",1);
        list = orderDao.selectOrder(map);
        //判断 查询数据 是否为空
        result.put("code",200);
        if(list.size()>0){
            result.put("msg", "操作成功");
            result.put("data",list);
        }else{
            result.put("msg", "没有数据...");
            result.put("data",list);
        }
        return result;
    }
}
