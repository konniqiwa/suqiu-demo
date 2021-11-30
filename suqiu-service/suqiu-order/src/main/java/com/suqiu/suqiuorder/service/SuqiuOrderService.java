package com.suqiu.suqiuorder.service;

import com.suqiu.suqiuuser.feign.SuqiuUserFeignClient;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: suqiu
 * @Date:
 **/
@Service("suqiuOrderService")
public class SuqiuOrderService {
    @Resource
    private SuqiuUserFeignClient suqiuUserFeignClient;

    public String testFeign() {
        return suqiuUserFeignClient.testFeign();
    }
}
