package com.etc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.etc.entity.User;
import com.etc.service.IUserService;


@Controller
@RequestMapping(value = "user")
public class textController {
	
	@Autowired
	@Qualifier("userService")
	private IUserService userService;
	
	@RequestMapping(value="findUser")
	public ModelAndView findAllUserinfo(String account){
		
		ModelAndView mav = new ModelAndView("index");
		
		User user = userService.findUser(account);
		
		mav.addObject("user",user);
		
		return mav;
	}
	
	@RequestMapping(value = "index")
	public String index(){
		return "index";
		
	}


}
