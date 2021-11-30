package com.suqiu.suqiuuser.controller;

import com.suqiu.suqiuuser.service.SuqiuUserService;
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
@RequestMapping("/user")
public class SuqiuUserController {

    @Resource
    private SuqiuUserService suqiuUserService;

    @GetMapping("/testFeign")
    public String testFeign() {
        return suqiuUserService.testFeign();
    }
}
