package com.becoder.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/sterotype/config.xml");

		Emp em = context.getBean("employee", Emp.class);
		System.out.println(em.hashCode());

		
		Emp em2 = context.getBean("employee", Emp.class);
		System.out.println(em2.hashCode());
	}

}
