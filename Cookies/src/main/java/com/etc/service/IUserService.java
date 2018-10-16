package com.etc.service;

import com.etc.entity.User;

public interface IUserService {
	
	public User findUser(String account);
	
	public void addUser(User user);
}
