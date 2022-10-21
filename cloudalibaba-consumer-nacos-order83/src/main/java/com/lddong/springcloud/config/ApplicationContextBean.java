package com.lddong.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author lddong
 * @create 2022-10-21 23:21
 */
@Configuration
public class ApplicationContextBean {
    @Bean
    @LoadBalanced // 该注解是开启负载均衡
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
}
