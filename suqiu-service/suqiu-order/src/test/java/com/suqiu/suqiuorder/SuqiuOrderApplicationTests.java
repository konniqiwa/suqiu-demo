package com.suqiu.suqiuorder;

import com.suqiu.suqiuorder.entity.Order;
import com.suqiu.suqiuorder.mapper.OrderMapper;
import com.suqiu.suqiuorder.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;

@SpringBootTest
class SuqiuOrderApplicationTests {

	@Resource
	private OrderService orderService;

	@Resource
	private OrderMapper orderMapper;

	@Test
	void contextLoads() {
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
	}



}
