package com.etc.service;

import com.etc.entity.Address;
import com.etc.entity.User;

public interface IUserService {
	
	public User findUser(String account,String password,String userphonenum);
	
	//通过是用户的名字，查询某个地址
	public User findAddressByUserName(User user);
	
	//通过是用户的名字，查询某个购物车
	public User findShoppingByUserName(User user);
	
	public int addUser(User user);
}
