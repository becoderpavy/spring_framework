package com.springmvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/profile")
	public String profile(HttpSession session) {
		return "profile";
	}

	@RequestMapping("/logout")
	public String logout(HttpSession session) {

		session.removeAttribute("loginUser");

		return "redirect:/home";
	}
}
