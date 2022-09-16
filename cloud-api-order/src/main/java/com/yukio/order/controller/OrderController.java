package com.yukio.order.controller;

import com.yukio.common.api.OrderService;
import com.yukio.common.domain.Order;
import com.yukio.common.result.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orderDetailById")
    public ResponseResult<Order> showOrderDescById(Long orderId) {
        if (Objects.isNull(orderId)) {
            return ResponseResult.fail("参数不能为空");
        }
        Order order = orderService.getOrderDetail(orderId);
        return ResponseResult.ok().data(order);
    }
}
