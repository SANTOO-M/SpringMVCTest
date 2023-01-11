package com.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	public HomeController() {
		System.out.println("Controller object created");
	}
	
	@RequestMapping("/")
	public String homePage() {
		return "index.jsp";
	}
	
	@RequestMapping("/checkResult")
	public String checkResult(HttpServletRequest request) {
		int x=Integer.parseInt(request.getParameter("n1"));
		int y=Integer.parseInt(request.getParameter("n2"));
		int result=x+y;
		return "display.jsp";
	}
}
