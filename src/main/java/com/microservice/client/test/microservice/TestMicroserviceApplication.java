package com.microservice.client.test.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TestMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestMicroserviceApplication.class, args);
	}

}
