package com.suqiu.suqiuuser.service;

import com.suqiu.suqiuorder.feign.SuqiuOrderFeignClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: suqiu
 * @Date:
 **/
@Service("suqiuUserService")
public class SuqiuUserService {

    @Resource
    private SuqiuOrderFeignClient suqiuOrderFeignClient;

    public String testFeign() {
        return "suqiuOrderFeignClient.testFeign()";
    }
}
