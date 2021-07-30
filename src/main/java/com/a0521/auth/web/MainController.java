package com.a0521.auth.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("title", "Login");
		return "auth/login";
	}
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "Welcome");
		return "main/landing";
	}
}
