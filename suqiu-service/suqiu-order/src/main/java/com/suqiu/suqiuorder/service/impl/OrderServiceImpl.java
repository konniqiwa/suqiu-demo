package com.suqiu.suqiuorder.service.impl;

import com.suqiu.suqiuorder.entity.Order;
import com.suqiu.suqiuorder.mapper.OrderMapper;
import com.suqiu.suqiuorder.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author suqiu
 * @since 2021-12-14
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    public void test() {
        getBaseMapper();
    }

}
