package com.lddong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author lddong
 * @create 2022-10-22 17:26
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosMain84 {

    public static void main(String[] args) {
        SpringApplication.run(OrderNacosMain84.class, args);
    }
}
