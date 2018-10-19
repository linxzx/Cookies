package com.etc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value ="web")
public class webController {

	@RequestMapping(value ="index")
	public 	String index(){
		
		return "index";
	}
	
	@RequestMapping(value ="test")
	public 	String test(){
		
		return "test";
	}
	
	@RequestMapping(value ="adminlogin")
	public 	String adminlogin(){
		
		return "adminlogin";
	}
	
}
