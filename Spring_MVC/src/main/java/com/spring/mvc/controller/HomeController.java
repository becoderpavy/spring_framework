package com.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model m) {
		m.addAttribute("name", "Pavy Kumar");
		m.addAttribute("roll", 34523432);

		List<String> list = new ArrayList<String>();
		list.add("Becoder");
		list.add("Pavy");
		list.add("Jageswar");
		m.addAttribute("nameList", list);
		return "home";
	}

	@RequestMapping("/login")
	public ModelAndView loginPage() {
		ModelAndView model = new ModelAndView();

		model.addObject("className", "12th class");
		model.addObject("regnumber",345242);
		
		List<String> list = new ArrayList<String>();
		list.add("Becoder");
		list.add("Pavy");
		list.add("Jageswar");
		model.addObject("nameList", list);
		
		
		model.setViewName("login");
		return model;
	}

}
