package com.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String checkResult(@RequestParam("n1") int x,@RequestParam("n2") int y,Model m) {		//(HttpServletRequest request, Model m) {
		if(x<0||y<0) {																				//int x=Integer.parseInt(request.getParameter("n1"));
			m.addAttribute("error", "Please Enter positive value");									//int y=Integer.parseInt(request.getParameter("n2"));
			return "error.jsp";
		}
		else {
		int result=x+y;
		m.addAttribute("res",result);
		System.out.println("result="+result);
		return "display.jsp";
		}
	}
}
