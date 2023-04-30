package com.becoder.dao;

import com.becoder.entity.User;

public interface UserDao {

	public int saveUser(User user);

	public User loginUser(String email, String passsword);

}
