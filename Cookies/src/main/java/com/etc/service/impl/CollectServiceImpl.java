package com.etc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.etc.dao.ICollectMapper;
import com.etc.service.ICollectService;


@Service(value = "collectService")
public class CollectServiceImpl implements ICollectService {
	
	@Autowired
	@Qualifier("collectMapper")
	private ICollectMapper collectMapper;

}
