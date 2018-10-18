package com.etc.service;

import java.util.List;

import com.etc.entity.Address;
import com.etc.entity.Food;
import com.etc.entity.Shop;
import com.etc.entity.User;

public interface IFoodService {
		

	//查询所有食物
	public List<Food> findAllFood();
	
	//通过食物Id查询食物
	public Food findFoodByFoodId(Food food);
	

	
	//添加食物
	public int addFood(Food food);
	
	//删除食物
	public int deleteFoodByFoodId(Food food);
	
	
}
