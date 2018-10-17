package com.etc.service.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.etc.entity.User;
import com.etc.service.IAddressService;


public class AddressServletImplTest {
	
	
	
	private IAddressService addressServlet = null;
	
	@Before
	public void before(){
		ClassPathXmlApplicationContext cpac = new ClassPathXmlApplicationContext(
				"spring-mybatis.xml");
		addressServlet = (IAddressService)cpac.getBean("addressServlet");
	}
	
	
	@Test
	public void testFindAllAddress() {
		
		System.out.println("sadfasdfasdf");

	}

	
	@Test
	public void testFindAddressByUserName() {
		
		User user = new User();
		user.setUsername("lin");
		
		System.out.println(addressServlet.findAddressByUserName(user));
	}

	
	@Test
	public void testAddAddress() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteAddressById() {
		fail("Not yet implemented");
	}

}
