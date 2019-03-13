package com.tricon.customer.customer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;

//@EnableDiscoveryClient
@SpringBootApplication
public class CustomerApplication {

	 private static final Logger logger = LoggerFactory.getLogger(CustomerApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
		
		
		 logger.error("logged at error level");
		 logger.warn("logged at warn level");
		 logger.info("logged at info level");
		 //by default will get the message till info level not till debug level
		 logger.debug("logged at debug level");
		 
	}
	
	@Bean
	public MethodValidationPostProcessor methodValidationPostProcessor() {
		return new MethodValidationPostProcessor();
	}

}
