package com.etc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.etc.entity.Address;
import com.etc.entity.User;

@Repository("addressMapper")
public interface IAddressMapper {
	
	
	//查询所有
	public List<Address> findAllAddress();
	
	//通过是用户的名字，查询某个地址
	public Address findAddressByUserName(User user);
	
	//添加地址
	public int addAddress(Address address);
	
	//删除地址
	public int deleteAddressById(Address address);
	

	
	

}
