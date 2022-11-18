package com.global.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.global.Entity.User;
import com.global.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String Home() {
		
		return "index";
	}
	
	@PostMapping("/register")
	public String register(@ModelAttribute User u ,HttpSession httpSession) {
		
		userService.addUser(u);
		httpSession.setAttribute("msg", "User Register Sucessfully...");
		return "redirect:/";
	}

}
