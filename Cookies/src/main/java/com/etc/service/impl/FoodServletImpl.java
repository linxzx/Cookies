package com.etc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.etc.dao.IFoodMapper;
import com.etc.entity.Food;
import com.etc.entity.Shop;
import com.etc.service.IFoodService;

@Service(value = "foodService")
public class FoodServletImpl implements IFoodService {
	
	@Autowired
	@Qualifier(value = "foodMapper")
	private IFoodMapper foodMapper;
	
	
	@Override
	public List<Food> findAllFood() {
		// TODO Auto-generated method stub
		return foodMapper.findAllFood();
	}

	@Override
	public Food findFoodByFoodId(Food food) {
		// TODO Auto-generated method stub
		return foodMapper.findFoodByFoodId(food);
	}

	@Override
	public Shop findFoodByShopName(Shop shop) {
		// TODO Auto-generated method stub
		return foodMapper.findFoodByShopName(shop);
	}

	@Override
	public int addFood(Food food) {
		// TODO Auto-generated method stub
		return foodMapper.addFood(food);
	}

	@Override
	public int deleteFoodByFoodId(Food food) {
		// TODO Auto-generated method stub
		return foodMapper.deleteFoodByFoodId(food);
	}

}
