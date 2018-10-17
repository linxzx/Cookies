package com.etc.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.etc.entity.User;

@Repository("userMapper")
public interface IUserMapper {
	//搜索
	public User findUser(@Param("account") String account,@Param("password") String password);
	//添加
	public int addUser(User user);

}
