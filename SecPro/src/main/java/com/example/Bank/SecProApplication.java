package com.example.Bank;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;



import java.time.LocalDate;
import java.time.LocalTime;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class SecProApplication {
	//static Logger log=Logger.getLogger(SecProApplication.class);
	private static final Logger logger = LoggerFactory.getLogger(SecProApplication.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(SecProApplication.class, args);
		BasicConfigurator.configure();
		LocalDate d=LocalDate.now();
		LocalTime t=LocalTime.now();
		int a=7,b=0;
		try {
			System.out.println(a/b);
			
		}catch(Exception e) {
			logger.info(e+" "+"Error occurred");
			logger.info(e+" "+d);
			logger.info(e+" "+t);
		}
		
		
		
	}

}
