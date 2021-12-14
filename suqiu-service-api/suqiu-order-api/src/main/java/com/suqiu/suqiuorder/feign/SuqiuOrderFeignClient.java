package com.suqiu.suqiuorder.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: suqiu
 * @Date:
 **/

@FeignClient(value = "suqiu-order")
@RequestMapping("/order")
public interface SuqiuOrderFeignClient {

//    @GetMapping("/testFeign")
//    public String testFeign();
}
