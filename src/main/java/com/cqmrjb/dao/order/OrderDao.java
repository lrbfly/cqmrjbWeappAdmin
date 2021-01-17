package com.cqmrjb.dao.order;

import com.cqmrjb.entity.order.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface OrderDao {
    List<Order> selectOrder(Map map);
}
