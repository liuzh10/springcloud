package com.yukio.order.service;

import com.yukio.common.api.OrderService;
import com.yukio.common.domain.Order;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;

@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public Order getOrderDetail(Long orderId) {
        Order order = new Order();
        order.setId(orderId);
        order.setOrderTime(new Date());
        order.setTotalCost(new BigDecimal(10.90));
        order.setOwner("和着阳光爱你");
        return order;
    }
}
