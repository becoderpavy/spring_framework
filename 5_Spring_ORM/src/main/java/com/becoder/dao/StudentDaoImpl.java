package com.becoder.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.becoder.Student;

public class StudentDaoImpl implements StudentDao {

	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int saveStudent(Student student) {
		int i = (Integer) hibernateTemplate.save(student);
		return i;
	}

	public Student getStudent(int id) {
		Student st = hibernateTemplate.get(Student.class, id);
		return st;
	}

	public List<Student> getAllStudent() {
		List<Student> list = hibernateTemplate.loadAll(Student.class);
		return list;
	}

	@Transactional
	public void updateStudent(Student student) {
		hibernateTemplate.update(student);
	}

	@Transactional
	public void deleteStudent(int id) {
		Student st = hibernateTemplate.get(Student.class, id);
		hibernateTemplate.delete(st);
	}

}
