package com.etc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.etc.dao.IShopRedPacketMapper;
import com.etc.service.IShopRedPacketService;

@Service("shopRedPacketService")
public class ShopRedPacketServletImpl implements IShopRedPacketService {
	
	@Autowired
	@Qualifier("shopRedPacketMapper")
	private IShopRedPacketMapper shopRedPacketMapper;
	


}
