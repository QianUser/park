package com.park.cloud.cms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.park.cloud.cms.mapper")
@ComponentScan(basePackages = {"com.park.*"})
@EnableEurekaClient
@EnableFeignClients
@EnableHystrix
@EnableDiscoveryClient
@SpringBootApplication
@EnableTransactionManagement
public class ParkCmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkCmsApplication.class, args);
	}
}
