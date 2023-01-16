package com.becoder.xml;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.becoder.dao.StudentDao;
import com.becoder.model.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws SQLException {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/xml/config.xml");

		/*
		 * JdbcTemplate jd = context.getBean("jdbcTemplate", JdbcTemplate.class);
		 * System.out.println(jd.getDataSource().getConnection());
		 */

		/*
		 * String sql = "insert into student(id,name,addres) values(?,?,?)";
		 * 
		 * int i = jd.update(sql, 1, "Becoder", "India");
		 * 
		 * Syste m.out.println("Sucessfully inserted" + i);
		 */

		/* insert */
		/*
		 * String sql = "insert into student(id,name,addres) values(?,?,?)"; int i =
		 * jd.update(sql, 3, "Rakesh", "USA");
		 * 
		 * System.out.println("inserted succefully " + i);
		 */

		/* update data */
		/*
		 * String sql="update student set name=? ,addres=? where id=?";
		 * 
		 * int i=jd.update(sql,"Rakesh Up","USA up",3);
		 * System.out.println("update succefully " + i);
		 */

		/* delete data */
		/*
		 * String sql = "delete from student where id=?"; int i = jd.update(sql, 3);
		 * System.out.println("delete succefully " + i);
		 */

		/* fetch data by id */
		/*
		 * String sql = "select * from student where id=?";
		 * 
		 * RowMapper rowMapper = new RowMapper() {
		 * 
		 * public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		 * 
		 * String name = rs.getString(2);
		 * 
		 * return name; }
		 * 
		 * };
		 * 
		 * String name = jd.queryForObject(sql, rowMapper, 2); System.out.println(name);
		 */

		/*
		 * String sql = "select * from student";
		 * 
		 * RowMapper rowMapper = new RowMapper() {
		 * 
		 * public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		 * 
		 * String name = rs.getString(2);
		 * 
		 * return name; } };
		 * 
		 * List<String> list = jd.query(sql, rowMapper);
		 * 
		 * for (String name : list) { System.out.println(name); }
		 */

		/* Perform Dao Standard */

		StudentDao dao = context.getBean("stDao", StudentDao.class);

		/* insert */

		Student st = new Student();
		st.setId(3);
		st.setName("Rakesh");
		st.setAddres("Uk");

		int i = dao.insert(st);
		System.out.println("insert sucessfully " + i);

		/* update details */
		/*
		 * Student st = new Student(); st.setId(3); st.setName("Rakesh up");
		 * st.setAddres("Uk up"); int i = dao.updateDetails(st);
		 * System.out.println("update sucessfully " + i);
		 */

		/* delete data */

		/*
		 * int i=dao.delete(3); System.out.println("delete sucessfully " + i);
		 */

		/*
		 * Student st = dao.getStudentById(1); System.out.println(st);
		 */

		List<Student> list = dao.getAllStudent();

		for (Student sts : list) {
			System.out.println(sts);
		}

	}
}
