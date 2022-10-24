package com.lddong.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lddong
 * @create 2022-10-24 0:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    /**
     * 订单状态：0：创建中；1：已完结
     */
    private Integer status;
}
