package com.etc.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.etc.dao.IUserMapper;
import com.etc.entity.User;
import com.etc.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	@Qualifier("userMapper")
	private IUserMapper userMapper;
	
	@Override
	public User findUser(String account) {
		
		return userMapper.findUser(account);
	}

	@Override
	public void addUser(User user) {
		
		userMapper.addUser(user);
	}

}
