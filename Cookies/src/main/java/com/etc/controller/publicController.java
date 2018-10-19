package com.etc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="public")
public class publicController {
	
	//设置从前端传回来的URL
	@RequestMapping(value="getURL",method = RequestMethod.POST)
	public void getURL(HttpSession session,HttpServletRequest request)  {
		String returnURL ="redirect:/"+ request.getParameter("returnURL");
		System.out.println(returnURL);
		session.setAttribute("returnURL", returnURL);
	}

}
