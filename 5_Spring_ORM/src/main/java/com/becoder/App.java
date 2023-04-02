package com.becoder;

import java.applet.Applet;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.becoder.dao.StudentDao;
import com.becoder.dao.StudentDaoImpl;

public class App {
	public static void main(String[] args) {
		System.out.println("-----------------");

		ApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/config.xml");
		/*
		 * HibernateTemplate tem = context.getBean("template", HibernateTemplate.class);
		 * System.out.println(tem);
		 */

		StudentDao dao = context.getBean("stDao", StudentDao.class);

		Student st = new Student();
		st.setId(2);
		st.setName("Becoder up");
		st.setAddress("UK up");

		/*
		 * int i = dao.saveStudent(st); System.out.println("Insert sucessfully " + i);
		 */

		/*
		 * Student st = dao.getStudent(2); System.out.println(st);
		 */

		/*
		 * dao.updateStudent(st); System.out.println("Update Sucessfully");
		 */

		dao.deleteStudent(2);

		List<Student> list = dao.getAllStudent();
		for (Student sts : list) {
			System.out.println(sts);
		}

	}
}
