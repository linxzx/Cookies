package com.etc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.etc.entity.User;
import com.etc.service.IShopService;
import com.etc.service.IUserService;


@Controller
@RequestMapping(value="test")
public class TestController {
	
	@Autowired
	@Qualifier("userService")
	private IUserService userService;
	                                                                                
	
	@RequestMapping(value="testUser")
	public ModelAndView findUser(){

		User user = new User();
		user.setUsername("lin");
		
		ModelAndView mav = new ModelAndView("adminindex");

		mav.addObject("test", userService.findAddressByUserName(user));
		
//		System.out.println(userService.findAddressByUserName(user));
		return mav;
		
		
	}
	
	@Autowired
	@Qualifier("shopService")
	private IShopService shopService;
	
	
	@RequestMapping(value="testShop")
	public ModelAndView findShop(){
		
		ModelAndView mav = new ModelAndView("adminindex");

		mav.addObject("foodOfShopList", shopService.findFoodOfShop());
		
		System.out.println(shopService.findFoodOfShop());
		
		return mav;
	}
	


}
