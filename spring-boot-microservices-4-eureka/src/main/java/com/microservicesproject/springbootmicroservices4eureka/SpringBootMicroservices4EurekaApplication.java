package com.microservicesproject.springbootmicroservices4eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootMicroservices4EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicroservices4EurekaApplication.class, args);
	}

}
