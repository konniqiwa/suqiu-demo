package com.suqiu.suqiuorder.controller;

import com.suqiu.suqiuorder.service.SuqiuOrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: suqiu
 * @Date:
 **/
@RestController
@RequestMapping("/order")
public class SuqiuOrderController {

    @Resource
    private SuqiuOrderService orderService;

    @GetMapping("/testFeign")
    public String testFeign() {
        return orderService.testFeign();
    }

}
