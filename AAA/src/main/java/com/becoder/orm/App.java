package com.becoder.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/orm/config.xml");
		StudentDao dao = context.getBean("dao", StudentDao.class);

		// tem.setCheckWriteOperations(false);

		Student st = new Student(1, "becoder", "Uk");

		Integer i = dao.saveData(st);
		System.out.println("Insert sucess=" + i);

	}

}
