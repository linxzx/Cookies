package com.etc.service;

import java.util.List;

import com.etc.entity.Shop;
import com.etc.entity.User;

public interface IShopService {
		
	//查询所有商家
	public List<Shop> findAllShop();
	
	//通过是商家名字，查询某个商家
	public Shop findShopByName(Shop shop);
	
	//通过商家Name查询属于商家的食物
	public Shop findFoodByShopName(Shop shop);
	
	//查询商家的食物
	public List<Shop> findFoodOfShop();
	
	//添加商家
	public int addShop(Shop shop);
	
	//删除商家
	public int deleteShopById(Shop shop);
	
	//修改商家信息
	public int updateShopById(Shop shop);
	
}
