package com.becoder.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.codec.Hints;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.becoder.entity.Notes;
import com.becoder.entity.User;

@Transactional
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	public int saveUser(User user) {
		int i = (Integer) hibernateTemplate.save(user);
		return i;
	}

	public User login(String email, String password) {

		String sql = "from User where email=:em and password=:pwd";

		User user = (User) hibernateTemplate.execute(s -> {
			Query q = s.createQuery(sql);
			q.setString("em", email);
			q.setString("pwd", password);
			return q.uniqueResult();
		});

		return user;
	}

	@Override
	public int saveNotes(Notes notes) {

		int i = (Integer) hibernateTemplate.save(notes);

		return i;
	}

	@Override
	public List<Notes> getNotesByUser(User user) {
		String sql = "from Notes where user=:us";

		List<Notes> list = hibernateTemplate.execute(s -> {
			Query q = s.createQuery(sql);
			q.setEntity("us", user);
			return q.getResultList();
		});

		return list;
	}

	@Override
	public Notes getNotesById(int id) {
		Notes n = hibernateTemplate.get(Notes.class, id);
		return n;
	}

	@Override
	public void deleteNotes(int id) {
		Notes n = hibernateTemplate.get(Notes.class, id);
		hibernateTemplate.delete(n);

	}

	@Override
	public void updateNotes(Notes n) {
		hibernateTemplate.update(n);
	}
	

}
