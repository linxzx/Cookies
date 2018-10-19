package com.etc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.etc.dao.IOrderToFoodMapper;
import com.etc.service.IOrderToFoodService;

@Service(value = "orderToFoodService")
public class OrderToFoodServiceImpl implements IOrderToFoodService {

	@Autowired
	@Qualifier("orderToFoodMapper")
	private IOrderToFoodMapper orderToFoodMapper;

}
