package com.cqmrjb.controller.order;

import com.cqmrjb.service.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/selectOrderList")
    @ResponseBody
    public Map<String,Object> selectOrderList(@RequestBody Map map){
        Map<String,Object> result = new HashMap<>();
        result = orderService.selectOrder(map);
        return result;
    }
}
