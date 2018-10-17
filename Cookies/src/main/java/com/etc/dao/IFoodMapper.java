package com.etc.dao;

import java.util.List;



import org.springframework.stereotype.Repository;

import com.etc.entity.Food;
import com.etc.entity.Rider;
import com.etc.entity.Shop;


@Repository("foodMapper")
public interface IFoodMapper {
	
	//查询所有食物
	public List<Food> findAllFood();
	
	//通过食物Id查询食物
	public Food findFoodByFoodId(Food food);
	
	//通过商家Name查询属于商家的食物
	public Shop findFoodByShopName(Shop shop);
	
	//添加食物
	public int addFood(Food food);
	
	//删除食物
	public int deleteFoodByFoodId(Food food);
	
	
}
