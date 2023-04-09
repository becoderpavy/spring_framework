package com.becoder.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/xml/config.xml");

		HibernateTemplate temp = context.getBean("hiberTemp", HibernateTemplate.class);
		System.out.println(temp.getSessionFactory());

	}
}
