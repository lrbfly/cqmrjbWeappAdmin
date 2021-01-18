package com.cqmrjb.controller.order;

import com.cqmrjb.service.order.OrderService;
import com.sun.jmx.snmp.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/selectOrderList")
    @ResponseBody
    //查询订单
    public Map<String,Object> selectOrderList(@RequestBody Map map){
        Map<String,Object> result = new HashMap<>();
        result = orderService.selectOrder(map);
        return result;
    }

    @RequestMapping("/addOrder")
    @ResponseBody
    //新增 订单
    public Map<String,Object> addOrder(@RequestBody Map map){
        Date date = new Date();
        Timestamp timeStamp = new Timestamp(date.getTime());
        map.put("create_time",timeStamp);
        Map<String,Object> result = new HashMap<>();
        result = orderService.addOrder(map);
        return result;
    }


}
