package com.etc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="login")
public class loginController {
	
	
	//获取账号和密码
	@RequestMapping(value="getAcandPw")
	public String  getAcandPw(String account,String password,HttpSession session){
		
		String url = "redirect:/login/checkAcandPw";
		return "redirect:/user/findUser?account="+account+"&password="+password+"&url="+url;
	}
	
	//检查账号密码是否错误
	@RequestMapping(value="checkAcandPw")
	public String checkAcandPw(HttpSession session){
	
		if(session.getAttribute("finduser")==null){
			System.out.println("账号或者密码错误");
		}else{
			System.out.println("登录成功");
			session.setAttribute("loginuser", session.getAttribute("finduser"));
		}
		
		return  (String) session.getAttribute("returnURL");
	}

}
