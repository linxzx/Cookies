package com.etc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.etc.dao.IShopMapper;
import com.etc.entity.Shop;
import com.etc.service.IShopService;

@Service("shopService")
public class ShopServletImpl implements IShopService {
	
	@Autowired
	@Qualifier("shopMapper")
	private IShopMapper shopMapper;
	
	@Override
	public List<Shop> findAllShop() {
		// TODO Auto-generated method stub
		return shopMapper.findAllShop();
	}

	@Override
	public Shop findShopByName(Shop shop) {
		// TODO Auto-generated method stub
		return shopMapper.findShopByName(shop);
	}
	
	@Override
	public Shop findFoodByShopName(Shop shop) {
		// TODO Auto-generated method stub
		return shopMapper.findFoodByShopName(shop);
	}

	@Override
	public int addShop(Shop shop) {
		// TODO Auto-generated method stub
		return shopMapper.addShop(shop);
	}

	@Override
	public int deleteShopById(Shop shop) {
		// TODO Auto-generated method stub
		return shopMapper.deleteShopById(shop);
	}

	@Override
	public int updateShopById(Shop shop) {
		// TODO Auto-generated method stub
		return shopMapper.updateShopById(shop);
	}

	@Override
	public List<Shop> findFoodOfShop() {
		// TODO Auto-generated method stub
		return shopMapper.findFoodOfShop();
	}

}
