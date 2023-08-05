package com.example.Examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Induction4Application {

	public static void main(String[] args) {
		SpringApplication.run(Induction4Application.class, args);
	}




@Bean

RestTemplate getRestTemplate() {
	return new RestTemplate();
   }

}
