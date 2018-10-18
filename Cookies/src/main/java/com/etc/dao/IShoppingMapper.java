package com.etc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.etc.entity.Shop;
import com.etc.entity.Shopping;
import com.etc.entity.User;

@Repository("shoppingMapper")
public interface IShoppingMapper {
	
	
	//查询所有购物车
	public List<Shopping> findAllShopping();

	
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
