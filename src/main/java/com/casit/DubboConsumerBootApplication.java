package com.casit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.casit.Controller")
public class DubboConsumerBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboConsumerBootApplication.class, args);
	}
}
