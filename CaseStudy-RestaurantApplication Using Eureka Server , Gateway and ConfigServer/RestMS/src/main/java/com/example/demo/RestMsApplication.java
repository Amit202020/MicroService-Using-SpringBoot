package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
public class RestMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestMsApplication.class, args);
	}
	
	
	@Bean
	public RestTemplate  getRestTemplate() {
		return new RestTemplate();
	}


}
