package com.everis.eurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringConfigProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigProject1Application.class, args);
	}

}
