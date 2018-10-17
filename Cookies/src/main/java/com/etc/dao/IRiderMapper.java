package com.etc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.etc.entity.Address;
import com.etc.entity.User;

@Repository("addressMapper")
public interface IRiderMapper {
	
	
	//查询所有骑手
	public List<Address> findAllAddress();
	
	//通过是订单查询某个骑手
	public Address findAddressByUserName(User user);
	
	//添加骑手
	public int addAddress(Address address);
	
	//删除骑手
	public int deleteAddressById(Address address);
	

	

}
