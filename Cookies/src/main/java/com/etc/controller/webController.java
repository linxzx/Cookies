package com.etc.controller;

import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

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
	
	@RequestMapping(value ="admin")
	public 	String admin(){
		
		return "admin";
	}
	
	@RequestMapping(value ="error")
	public 	String error(){
		
		return "error";
	}
	
	
}
