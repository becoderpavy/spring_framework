package com.becoder.orm;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

public class StudentDao {

	private HibernateTemplate hiberTemp;

	public HibernateTemplate getHiberTemp() {
		return hiberTemp;
	}

	public void setHiberTemp(HibernateTemplate hiberTemp) {
		this.hiberTemp = hiberTemp;
	}

	@Transactional
	public Integer saveData(Student st) {
		return (Integer) hiberTemp.save(st);
	}

}
