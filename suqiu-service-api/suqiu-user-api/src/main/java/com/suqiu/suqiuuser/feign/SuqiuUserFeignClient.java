package com.suqiu.suqiuuser.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: suqiu
 * @Date:
 **/
@FeignClient(value = "suqiu-user")
@RequestMapping("/user")
public interface SuqiuUserFeignClient {

    @GetMapping("/testFeign")
    public String testFeign();
}
