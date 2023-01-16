package com.becoder.javaconfig;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.becoder.dao.StudentDao;
import com.becoder.model.Student;

public class App {
	public static void main(String[] args) throws SQLException {

		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);

		JdbcTemplate jd = context.getBean("jdbc", JdbcTemplate.class);

		System.out.println(jd.getDataSource().getConnection());
		/*
		 * String sql = "insert into student(id,name,addres) values(?,?,?)"; int i =
		 * jd.update(sql, 2, "Pavy", "USA");
		 * System.out.println("sucessfully inserted : " + i);
		 */

		/* Perform Dao Standard */

		StudentDao dao = context.getBean("stDao", StudentDao.class);

		/* insert */

		/*
		 * Student st = new Student(); st.setId(4); st.setName("jageswar");
		 * st.setAddres("London");
		 * 
		 * int i = dao.insert(st); System.out.println("insert sucessfully " + i);
		 */
		/* update details */

		/*
		 * Student st = new Student(); st.setId(4); st.setName("jageswar up");
		 * st.setAddres("jageswar up"); int i = dao.updateDetails(st);
		 * System.out.println("update sucessfully " + i);
		 */

		/* delete data */

		/*
		 * int i = dao.delete(4); System.out.println("delete sucessfully " + i);
		 */

		/*
		 * Student st = dao.getStudentById(3); System.out.println(st);
		 */

		List<Student> list = dao.getAllStudent();

		for (Student sts : list) {
			System.out.println(sts);
		}

	}
}
