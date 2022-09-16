package com.liuzh10.common.domain;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Order {
    /**
     * 订单ID
     */
    private Long id;

    /**
     * 下单人
     */
    private String owner;

    /**
     * 总花费
     */
    private BigDecimal totalCost;

    /**
     * 下单时间
     */
    private Date orderTime;
}
