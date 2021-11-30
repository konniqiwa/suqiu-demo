package com.suqiu.suqiuorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author suqiu
 */
@EnableFeignClients(basePackages = {"com.suqiu"})
@EnableDiscoveryClient
@SpringBootApplication
public class SuqiuOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuqiuOrderApplication.class, args);
	}

}
