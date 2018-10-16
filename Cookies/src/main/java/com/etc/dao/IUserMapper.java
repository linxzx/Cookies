package com.etc.dao;

import org.springframework.stereotype.Repository;

import com.etc.entity.User;

@Repository("userMapper")
public interface IUserMapper {
	
	
	public User findUser(String account);
	
	public void addUser(User user);
	

}
