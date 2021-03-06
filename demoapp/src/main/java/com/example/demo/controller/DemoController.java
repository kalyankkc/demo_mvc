package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
	@RequestMapping("/")
	public String index()
	{ 
		return "index";
	}
	
	 @PostMapping("/hello")
	   public String sayHello(@RequestParam String name, Model model) {
	      model.addAttribute("name", name);
	      return "hello";
	 }

}
