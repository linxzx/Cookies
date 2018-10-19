package com.etc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.etc.dao.IOrderMapper;
import com.etc.service.IOrderService;

@Service(value = "orderService")
public class OrderServiceImpl implements IOrderService {

	@Autowired
	@Qualifier("orderMapper")
	private IOrderMapper orderMapper;

}
