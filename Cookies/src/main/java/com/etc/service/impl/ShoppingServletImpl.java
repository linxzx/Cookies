package com.etc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.etc.dao.IShoppingMapper;
import com.etc.entity.Shopping;
import com.etc.entity.User;
import com.etc.service.IShoppingService;

@Service(value = "shoppingService")
public class ShoppingServletImpl implements IShoppingService {

	@Autowired
	@Qualifier(value = "shoppingMapper")
	private IShoppingMapper shoppingMapper;
	
	@Override
	public List<Shopping> findAllShopping() {
		// TODO Auto-generated method stub
		return shoppingMapper.findAllShopping();
	}

	@Override
	public User findShoppingByUserName(User user) {
		// TODO Auto-generated method stub
		return shoppingMapper.findShoppingByUserName(user);
	}

	@Override
	public Shopping findshoppingByAllId(Shopping shopping) {
		// TODO Auto-generated method stub
		return shoppingMapper.findshoppingByAllId(shopping);
	}

	@Override
	public int addShopping(Shopping shopping) {
		// TODO Auto-generated method stub
		return shoppingMapper.addShopping(shopping);
	}

	@Override
	public int deleteShoppingByUserId(User user) {
		// TODO Auto-generated method stub
		return shoppingMapper.deleteShoppingByUserId(user);
	}

	@Override
	public int deleteShoppingByAllId(Shopping shopping) {
		// TODO Auto-generated method stub
		return shoppingMapper.deleteShoppingByAllId(shopping);
	}

	@Override
	public int updateShoppingByAllId(Shopping shopping) {
		// TODO Auto-generated method stub
		return shoppingMapper.updateShoppingByAllId(shopping);
	}

}
