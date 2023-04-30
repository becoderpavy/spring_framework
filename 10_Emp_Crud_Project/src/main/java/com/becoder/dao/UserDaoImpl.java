package com.becoder.dao;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.becoder.entity.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public int saveUser(User user) {

		int i = (Integer) hibernateTemplate.save(user);

		return i;
	}

	public User loginUser(String email, String passsword) {
		// TODO Auto-generated method stub

		// select * from user where email=? and password=? ; ->user object
		String sql = "from User where email=:em and password=:pwd";

		User us = (User) hibernateTemplate.execute(s -> {

			Query q = s.createQuery(sql);
			q.setString("em", email);
			q.setString("pwd", passsword);
			return q.uniqueResult();
		});

		return us;
	}

}
