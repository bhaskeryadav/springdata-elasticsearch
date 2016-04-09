package com.demo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.demo")
@SpringBootApplication
public class SpringDataElasticSearchDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataElasticSearchDemoApplication.class, args);
	}
}
