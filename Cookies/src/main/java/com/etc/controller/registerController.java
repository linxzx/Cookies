package com.etc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="register")
public class registerController {
	
	//获取注册数据
	@RequestMapping(value="getPwData")
	public String  getPwData(String account, String password, String userphonenum,
			String username,String usersex,HttpSession session){
			String url = "redirect:/register/checkPwData?account="+account
				+ "&password="+password
				+ "&userphonenum="+userphonenum
				+ "&username="+username
				+ "&usersex="+usersex;
			session.setAttribute("url", url);
		 return "redirect:/user/findUser?account="+account;
	}
	
	//验证账号
	@RequestMapping(value="checkPwData")
	public String  checkPwData(String account, String password, String userphonenum,
			String username,String usersex,HttpSession session){
		if(session.getAttribute("user")!=null){
			System.out.println("该账号已存在");
			return "redirect:/web/index";
		}
		String url = "redirect:/web/index";
		
		return "redirect:/user/addUser?account="+account
				+ "&password="+password
				+ "&userphonenum="+userphonenum
				+ "&username="+username
				+ "&usersex="+usersex
				+ "&url="+url;
	}
	
}
