package com.springmvc.controller;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import com.springmvc.entity.User;
import com.springmvc.service.UserService;

@Controller
public class Homcontroller {

	@Autowired
	private UserService userService;

	@RequestMapping("/home")
	public String home() {

		// Integer.parseInt("Becoder");
		String name = null;
		name.toUpperCase();
		return "home";
	}

	/*
	 * @ExceptionHandler(NumberFormatException.class) public String numberExcption()
	 * { return "error"; }
	 * 
	 * @ExceptionHandler(NullPointerException.class) public String nullExcption() {
	 * return "error"; }
	 */

	/*
	 * @ExceptionHandler(Exception.class) public String allExcption() { return
	 * "error"; }
	 */

	@RequestMapping("/register")
	public String signup() {
		return "register";
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

	@RequestMapping(path = "/user/{id}/{name}")
	public String demo(@PathVariable("id") int id, @PathVariable String name) {
		System.out.println("id=" + id);
		System.out.println("Name=" + name);
		return "home";
	}

	@RequestMapping(path = "/load_file_upload")
	public String loadFileUploadPage() {
		return "file_upload";
	}

	@RequestMapping(path = "/fileUpload", method = RequestMethod.POST)
	public String fileUpload(@RequestParam("img") CommonsMultipartFile file, HttpServletRequest req, Model m) {

		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getContentType());
		System.out.println(file.getSize());

		byte[] bytes = file.getBytes();

		String path = req.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources"
				+ File.separator + "img" + File.separator + file.getOriginalFilename();

		System.out.println(path);
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(bytes);
			fos.close();
			System.out.println("File Uploaded");
		} catch (Exception e) {
			e.printStackTrace();
		}
		m.addAttribute("imgname", file.getOriginalFilename());
		return "file_success";

	}

}
