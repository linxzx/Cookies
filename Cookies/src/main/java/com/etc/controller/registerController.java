package com.etc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.etc.entity.User;

@Controller
@RequestMapping(value="register")
public class registerController {
	
	//获取注册数据
	@RequestMapping(value="getPwData")
	public String  getPwData(String account, String password, String userphonenum,
			String username,String usersex,HttpSession session){
			
			User user = new User(account,password,userphonenum,username,usersex);
			
			session.setAttribute("adduser", user);
		
			String url = "redirect:/register/checkPwData";
			
		 return "redirect:/user/findUser?account="+account+"&userphonenum="+userphonenum+"&url="+url;
	}
	
	//验证账号
	@RequestMapping(value="checkPwData")
	public String  checkPwData(String account, String password, String userphonenum,
			String username,String usersex,HttpSession session){
		if(session.getAttribute("finduser")!=null){
			System.out.println("该账号已存在");
			return "redirect:/web/index";
		}
		String url = (String) session.getAttribute("returnURL");
		
		return "redirect:/user/addUser?url="+url;
	}
	
}
