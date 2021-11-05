package edu.vinaenter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET, value = "/helloworld")
	public String index(Model model) {
		model.addAttribute("msg", "Nguyen Van Dinh");
		return "hello";
	}

}
