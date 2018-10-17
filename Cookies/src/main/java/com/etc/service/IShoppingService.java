package com.etc.service;

import java.util.List;

import com.etc.entity.Shop;
import com.etc.entity.Shopping;
import com.etc.entity.User;

public interface IShoppingService {
		
	//查询所有购物车
	public List<Shopping> findAllShopping();
	
	//通过是用户的名字，查询某个购物车
	public User findShoppingByUserName(User user);
	
	//通过是三个id查询某个购物车中的物品
	public Shopping findshoppingByAllId(Shopping shopping);
	
	//添加购物车
	public int addShopping(Shopping shopping);
	
	//清空某用户购物车
	public int deleteShoppingByUserId(User user);
	
	//删除购物车某件物品
	public int deleteShoppingByAllId(Shopping shopping);
	
	//修改购物车信息
	public int updateShoppingByAllId(Shopping shopping);
	
}
