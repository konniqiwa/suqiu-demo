package com.suqiu.suqiuuser;

import com.suqiu.suqiuuser.entity.User;
import com.suqiu.suqiuuser.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SuqiuUserApplicationTests {

	@Resource
	private UserService userService;

	@Test
	void contextLoads() {
		User user = new User();


		userService.save(user);
	}

}
