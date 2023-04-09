package com.becoder;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		/*
		 * Ram r=context.getBean("r1", Ram.class); System.out.println(r);
		 */
		/*
		 * Shyam sh = context.getBean("s1", Shyam.class); System.out.println(sh);
		 */

		Ram r = context.getBean("r", Ram.class);
		System.out.println(r);

	}
}
