package com.etc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.etc.dao.IAddressMapper;
import com.etc.dao.IShopMapper;
import com.etc.entity.Address;
import com.etc.entity.Shop;
import com.etc.entity.User;
import com.etc.service.IAddressService;

@Service("addressService")
public class AddressServletImpl implements IAddressService {

	@Autowired
	@Qualifier("addressMapper")
	private IAddressMapper addressMapper;
	
	@Override
	public List<Address> findAllAddress() {
		// TODO Auto-generated method stub
		return addressMapper.findAllAddress();
	}

	@Override
	public Address findAddressByUserName(User user) {
		// TODO Auto-generated method stub
		return addressMapper.findAddressByUserName(user);
	}

	@Override
	public int addAddress(Address address) {
		// TODO Auto-generated method stub
		return addressMapper.addAddress(address);
	}

	@Override
	public int deleteAddressById(Address address) {
		// TODO Auto-generated method stub
		return addressMapper.deleteAddressById(address);
	}
	



}
