package com.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.springmvc.entity.User;
import com.springmvc.service.UserService;

@Controller
public class Homcontroller {

	@Autowired
	private UserService userService;

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping("/register")
	public String signup() {
		return "register";
	}

	@RequestMapping(path = "/createUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute User user, @RequestParam("img") String img, Model m) {
		user.setImage(img);
		userService.saveUser(user);
		return "success";
	}

	@RequestMapping(path = "/google")
	public String redirectPage() {
		return "redirect:https://www.google.com";
	}

	@RequestMapping(path = "/yahoo")
	public RedirectView redirect2ndway() {
		RedirectView redirect = new RedirectView();
		redirect.setUrl("https://in.search.yahoo.com/");
		return redirect;
	}

	@RequestMapping(path = "/search", method = RequestMethod.POST)
	public String search(@RequestParam("keyword") String keyword) {
		String url = "http://www.google.com/search?q=" + keyword;
		return "redirect:" + url;
	}

}
