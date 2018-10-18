package com.etc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.etc.entity.User;
import com.etc.service.IUserService;


@Controller
@RequestMapping(value="user")
public class userController {
	
	@Autowired
	@Qualifier("userService")
	private IUserService userService;
	                                                                                
	
	@RequestMapping(value="findUser")
	public String findUser(String account,String password,String userphonenum,String url,HttpSession session){
		
		session.setAttribute("finduser", userService.findUser(account,password,userphonenum));
		return url;
	}
	
	@RequestMapping(value="addUser")
	public String addUser(String account, String password, String userphonenum,
			String username,String usersex,String url,HttpSession session){
				User user =(User) session.getAttribute("adduser");
				userService.addUser(user);
				return url;
	}

}
