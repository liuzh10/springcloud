package com.yukio.common.api;

import com.yukio.common.domain.Order;

public interface OrderService {
    /**
     * 根据订单ID查询订单
     *
     * @param orderId
     * @return
     */
    Order getOrderDetail(Long orderId);
}
