package com.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String sayHello(ModelMap map) {
		map.addAttribute("msg", "Nguyen Van Dinh");
		return "hello";
	}
}
