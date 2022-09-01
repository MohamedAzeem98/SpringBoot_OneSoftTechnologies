package com.example.UseProductDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class UseProductDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UseProductDetailsApplication.class, args);
	}
	@Bean
	
	RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}

