package com.example.ServiceSTR;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceStrApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceStrApplication.class, args);
	}
}
