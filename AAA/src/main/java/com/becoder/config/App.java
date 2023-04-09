package com.becoder.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Student st = context.getBean("getStudent", Student.class);
		System.out.println(st.getAddress());
	}
}
