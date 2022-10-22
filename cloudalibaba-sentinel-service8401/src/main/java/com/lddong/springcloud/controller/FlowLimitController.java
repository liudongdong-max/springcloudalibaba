package com.lddong.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lddong
 * @create 2022-10-22 13:53
 */
@RestController
public class FlowLimitController {
    @GetMapping("/testA")
    public String testA()
    {
        return "------testA";
    }
    @GetMapping("/testB")
    public String testB()
    {
        return "------testB";
    }
}
