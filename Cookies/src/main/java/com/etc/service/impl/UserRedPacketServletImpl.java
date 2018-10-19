package com.etc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.etc.dao.IUserRedPacketMapper;
import com.etc.service.IUserRedPacketService;

@Service("userRedPacketService")
public class UserRedPacketServletImpl implements IUserRedPacketService {
	
	@Autowired
	@Qualifier("UserRedPacketMapper")
	private IUserRedPacketMapper userRedPacketMapper;
	


}
