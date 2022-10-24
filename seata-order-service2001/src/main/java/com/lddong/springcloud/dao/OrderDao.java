package com.lddong.springcloud.dao;


import com.lddong.springcloud.domain.Order;
import feign.Param;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lddong
 * @create 2022-10-24 0:27
 */
@Mapper
public class OrderDao {

    /**
     * 创建订单
     */
    void create(Order order);

    /**
     * 修改订单金额
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
