package com.etc.service.impl;


import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.etc.dao.IUserMapper;
import com.etc.entity.Address;
import com.etc.entity.User;
import com.etc.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Autowired
	@Qualifier("userMapper")
	private IUserMapper userMapper;
	
	@Override
	public User findUser(String account,String password,String userphonenum) {
		
		return userMapper.findUser(account,password,userphonenum);
	}
	
	@Override
	public User findAddressByUserName(User user) {
		// TODO Auto-generated method stub
		return userMapper.findAddressByUserName(user);
	}

	@Override
	public User findShoppingByUserName(User user) {
		// TODO Auto-generated method stub
		return userMapper.findShoppingByUserName(user);
	}
	
	
	@Override
	public int addUser(User user) {
		System.out.println("SERVICE"+user.toString());
		return userMapper.addUser(user);
	}
}
