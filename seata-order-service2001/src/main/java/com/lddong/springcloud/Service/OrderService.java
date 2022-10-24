package com.lddong.springcloud.Service;

import com.lddong.springcloud.domain.Order;

/**
 * @author lddong
 * @create 2022-10-24 0:34
 */
public interface OrderService {
    /**
     * 创建订单
     */
    void create(Order order);
}
