package com.etc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.etc.entity.Shop;
import com.etc.entity.User;

@Repository("shopMapper")
public interface IShopMapper {
	
	
	//查询所有商家
	public List<Shop> findAllShop();
	
	//通过是商家名字，查询某个商家
	public Shop findShopByName(Shop shop);
	
	//添加商家
	public int addShop(Shop shop);
	
	//删除商家
	public int deleteShopById(Shop shop);
	
	//修改商家信息
	public int updateShopById(Shop shop);
	
	

}
