package com.cqmrjb.service.order;


import com.cqmrjb.dao.app.WxAppDao;
import com.cqmrjb.dao.order.OrderDao;
import com.cqmrjb.entity.app.WxApp;
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
    @Autowired
    private WxAppDao wxAppDao;

    public Map<String,Object> selectOrder(Map map){
        Map<String,Object> result = new HashMap<>();
        List<Order> list =  new ArrayList<>();
        map.put("order_status",1);
        list = orderDao.selectOrder(map);

        for(int i=0,l=list.size();i<l;i++){
            Map<String,Object> appMap = new HashMap<>();
            appMap.put("is_delete",1);// 默认查询 is_delete 为 1 的
            appMap.put("appId",list.get(i).getOrder_source());
            List<WxApp> WxAppList = wxAppDao.selectApp(appMap);
            for (int j=0,k=WxAppList.size();j<k;j++){
                list.get(i).setOrder_source(WxAppList.get(j).getAppName());
            }
        }
        //判断 查询数据 是否为空
        result.put("code",200);
        if(list.size()>0){
            result.put("msg", "操作成功");
            result.put("data",list);
        }else{
            result.put("msg", "操作失败");
            result.put("data",list);
        }
        return result;
    }

    //新增订单
    public Map<String,Object> addOrder(Map map){
        Map<String,Object> result = new HashMap<>();
        int num  = orderDao.addOrder(map);
        //判断 新增数据 是否为空
        if(num>0){
            result.put("msg", "操作成功");
        }else{
            result.put("msg", "没有提交失败...");
        }
        result.put("code",200);
        return result;
    }
    //修改订单
    public Map<String,Object> updataOrder(Map map){
        Map<String,Object> result = new HashMap<>();
        int num  = orderDao.updataOrder(map);
        //判断 修改数据 是否为空
        if(num>0){
            Map<String,Object> selectMap = new HashMap<>();
            List<Order> list =  new ArrayList<>();
            selectMap.put("order_status",1);
            selectMap.put("page",0);
            selectMap.put("pageSize",20);
            list = orderDao.selectOrder(selectMap);
            result.put("data",list);
            result.put("msg", "操作成功");
        }else{
            result.put("msg", "没有提交失败...");
        }
        result.put("code",200);
        return result;
    }

}
