package com.etc.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.etc.entity.Address;
import com.etc.entity.User;

@Repository("userMapper")
public interface IUserMapper {
	//搜索
	public User findUser(@Param("account") String account,@Param("password") String password);
	
	//通过是用户的名字，查询某个地址
	public User findAddressByUserName(User user);
	
	//通过是用户的名字，查询某个购物车
	public User findShoppingByUserName(User user);
	
	//添加
	public int addUser(User user);

}
