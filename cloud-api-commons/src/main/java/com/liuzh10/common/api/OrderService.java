package com.liuzh10.common.api;

import com.liuzh10.common.domain.Order;

public interface OrderService {
    /**
     * 根据订单ID查询订单
     *
     * @param orderId
     * @return
     */
    Order getOrderDetail(Long orderId);
}
