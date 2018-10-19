package com.etc.controller;


import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value="adminLogin")
public class adminLoginController {
	
	@RequestMapping(value="login",method = RequestMethod.POST)
	@ResponseBody
	public void login(HttpServletRequest request,PrintWriter printWriter){
		
		String login =request.getParameter("login");
		String pwd =request.getParameter("pwd");
		System.out.println(login);
		System.out.println(pwd);
		if(login.equals("admin")&&pwd.equals("wswbb")){
			request.getSession().setAttribute("adminLogin",true);
			printWriter.write("true");
		}else{
			printWriter.write("flase");
		}
        printWriter.flush();
        printWriter.close();
	}

}
