package com.becoder.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.mysql.cj.result.Row;

public class App {
	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/becoder/jdbc/config.xml");
		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

		System.out.println(template.getDataSource().getConnection());

		/*
		 * String sql = "insert into student(id,name,address) values(?,?,?)";
		 * 
		 * int i = template.update(sql, 1, "Pavy", "India");
		 * System.out.println("inserted");
		 */

		RowMapper<Student> rm = new RowMapper<Student>() {

			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student st = new Student();
				st.setId(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setAddress(rs.getString(3));
				return st;
			}
		};

		Student stu = template.queryForObject("select * from student where id=?", rm, 1);

		List<Student> sts = template.query("select * from student", rm);
		System.out.println(stu);

		for (Student s : sts) {
			System.out.println(s);
		}

	}
}
