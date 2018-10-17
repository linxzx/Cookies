package com.etc.service;

import java.util.List;

import com.etc.entity.Address;
import com.etc.entity.Rider;
import com.etc.entity.Shop;
import com.etc.entity.User;

public interface IRiderService {
		
	//查询所有骑手
	public List<Rider> findAllRider();
	
	//通过是订单查询某个骑手
	public Rider findRiderById(Rider rider);
	
	//添加骑手
	public int addRider(Rider rider);
	
	//删除骑手
	public int deleteRiderById(Rider rider);
	
}
