package com.lddong.springcloud.service.impl;

import com.lddong.springcloud.CommonResult;
import com.lddong.springcloud.Payment;
import com.lddong.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @author lddong
 * @create 2022-10-22 23:37
 */
@Component
public class PaymentFallbackService  implements PaymentService {
    public CommonResult paymentSQL(Long id) {
        return new CommonResult(444,"服务降级返回,没有该流水信息",new Payment(id, "errorSerial......"));
    }
}
