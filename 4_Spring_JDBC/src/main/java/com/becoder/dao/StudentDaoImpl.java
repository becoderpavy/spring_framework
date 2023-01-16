package com.becoder.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.becoder.model.Student;

@Component("stDao")
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	/*
	 * public JdbcTemplate getJdbcTemplate() { return jdbcTemplate; }
	 * 
	 * public void setJdbcTemplate(JdbcTemplate jdbcTemplate) { this.jdbcTemplate =
	 * jdbcTemplate; }
	 */

	public int insert(Student student) {

		String sql = "insert into student(id,name,addres) values(?,?,?)";
		int i = jdbcTemplate.update(sql, student.getId(), student.getName(), student.getAddres());
		return i;
	}

	public int updateDetails(Student student) {
		String sql = "update student set name=? ,addres=? where id=?";
		int i = jdbcTemplate.update(sql, student.getName(), student.getAddres(), student.getId());

		return i;
	}

	public int delete(int id) {
		String sql = "delete from student where id=?";
		int i = jdbcTemplate.update(sql, id);
		return i;
	}

	public Student getStudentById(int id) {
		String sql = "select * from student where id=?";
		RowMapper rowMapper = new RowMapper() {

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

				Student st = new Student();
				st.setId(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setAddres(rs.getString(3));
				return st;
			}

		};

		Student st = jdbcTemplate.queryForObject(sql, rowMapper, id);

		return st;
	}

	public List<Student> getAllStudent() {
		String sql = "select * from student";
		RowMapper rowMapper = new RowMapper() {

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

				Student st = new Student();
				st.setId(rs.getInt(1));
				st.setName(rs.getString(2));
				st.setAddres(rs.getString(3));
				return st;
			}

		};
		List<Student> list = jdbcTemplate.query(sql, rowMapper);

		return list;
	}

}
