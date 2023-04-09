package com.becoder.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public Student getStudent() {
		return new Student();
	}

	@Bean
	public Address address() {
		return new Address("First Bean");
	}

	@Bean
	public Address add() {
		return new Address("second Bean");
	}

}
