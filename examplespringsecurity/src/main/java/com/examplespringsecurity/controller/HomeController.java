package com.examplespringsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@Controller
public class HomeController {

	@GetMapping("/")
	@ResponseBody
	public String homePage() {
		return "Welcome to home!!!";
	}
	
	@RequestMapping("/home")
	public String jspHome() {
		System.out.println("Welcome to home page!!!");
		return "Home";
		
	}
	
	//CRUD OPERATION
	
	
	

	
}
