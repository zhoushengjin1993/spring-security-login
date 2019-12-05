package com.sabchow.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/main")
	public String toMainPage() {
		return "main";
	}

	@RequestMapping("/403")
	public String forbbiden() {
		return "/403";
	}

	@RequestMapping("/login")
	public String lognPage() {
		return "login";
	}
}
