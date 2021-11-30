package com.suqiu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author suqiu
 */
@EnableFeignClients(basePackages = {"com.suqiu"})
@EnableDiscoveryClient
@SpringBootApplication
public class SuqiuGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuqiuGatewayApplication.class, args);
	}

}
