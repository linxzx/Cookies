package com.etc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.etc.dao.IDiscountMapper;
import com.etc.service.IDiscountService;

@Service(value = "discountService")
public class DiscountServiceImpl implements IDiscountService {

	@Autowired
	@Qualifier("discountMapper")
	private IDiscountMapper discountMapper;

}
