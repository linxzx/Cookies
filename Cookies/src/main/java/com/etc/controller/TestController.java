package com.etc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.etc.entity.User;
import com.etc.service.IAddressService;
import com.etc.service.IUserService;


@Controller
@RequestMapping(value="test")
public class TestController {
	
	@Autowired
	@Qualifier("userService")
	private IAddressService addressServlet;
	                                                                                
	
	@RequestMapping(value="testFindAllAddress")
	public ModelAndView findUser(String name){
		
		
		User user = new User();
		user.setUsername("lin");
		
		ModelAndView mav = new ModelAndView("test");
	
		
		mav.addObject("test", addressServlet.findAddressByUserName(user));
		return mav;
	}
	


}
