package com.etc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.etc.dao.IRiderMapper;
import com.etc.entity.Rider;
import com.etc.service.IRiderService;

@Service(value = "riderService")
public class RiderServletImpl implements IRiderService {
	
	
	@Autowired
	@Qualifier("riderMapper")
	private IRiderMapper riderMapper; 

	@Override
	public List<Rider> findAllRider() {
		// TODO Auto-generated method stub
		return riderMapper.findAllRider();
	}

	@Override
	public Rider findRiderById(Rider rider) {
		// TODO Auto-generated method stub
		return riderMapper.findRiderById(rider);
	}

	@Override
	public int addRider(Rider rider) {
		// TODO Auto-generated method stub
		return riderMapper.addRider(rider);
	}

	@Override
	public int deleteRiderById(Rider rider) {
		// TODO Auto-generated method stub
		return riderMapper.deleteRiderById(rider);
	}

}
