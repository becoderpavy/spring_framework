package com.becoder.autowire.annot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/autowire/annot/config.xml");

		Student student = context.getBean("st", Student.class);
		System.out.println(student);

	}
}
