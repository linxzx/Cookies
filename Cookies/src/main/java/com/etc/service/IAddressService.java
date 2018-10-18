package com.etc.service;

import java.util.List;

import com.etc.entity.Address;
import com.etc.entity.Shop;
import com.etc.entity.User;

public interface IAddressService {
		

	//查询所有
	public List<Address> findAllAddress();
	

	
	//添加地址
	public int addAddress(Address address);
	
	//删除地址
	public int deleteAddressById(Address address);
	
}
