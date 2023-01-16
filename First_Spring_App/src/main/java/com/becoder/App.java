package com.becoder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		/*
		 * Action ac=new Ram(); ac.eat(); ac.sleep();
		 */

		ApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/config.xml");
		System.out.println(context);

		Ram sh=context.getBean("person",Ram.class);
		sh.eat();
		sh.sleep();
		
	}
}
