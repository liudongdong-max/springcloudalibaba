package com.lddong.springcloud.Controller;

import com.lddong.springcloud.Service.OrderService;
import com.lddong.springcloud.domain.CommonResult;
import com.lddong.springcloud.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lddong
 * @create 2022-10-24 0:37
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功!");
    }
}
