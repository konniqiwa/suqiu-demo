package com.suqiu.suqiuorder.controller;


import com.suqiu.suqiuorder.entity.Order;
import com.suqiu.suqiuorder.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author suqiu
 * @since 2021-12-14
 */
@RestController
@RequestMapping("/suqiuorder/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("hehe")
    public String testhehe() {
        Order order = new Order();
        order.setType(1);
        order.setStatus(1);
        order.setItemId(21312313L);
        order.setFee(1000);
        order.setCreateTime(new Date());
        order.setUpdateTime(new Date());
        order.setIsDelete(0);
//		orderMapper.insert(order);
        orderService.save(order);
        return "hehe";
    }

}

