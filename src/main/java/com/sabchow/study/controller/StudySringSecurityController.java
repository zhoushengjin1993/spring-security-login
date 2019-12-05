package com.sabchow.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sabchow.utils.SecurityUtils;

@RequestMapping("/study")
@Controller
public class StudySringSecurityController {

	@RequestMapping("/index")
	public String toIndexPage() {
		return "index";
	}

	@RequestMapping("/add")
	public String add() {
		Long currentUserId = SecurityUtils.getCurrentUserId();
		System.out.println(currentUserId);
		return "/study/add";
	}

	@RequestMapping("/delete")
	public String delete() {
		return "/study/delete";
	}

	@RequestMapping("/update")
	public String update() {
		return "/study/update";
	}

	@RequestMapping("/list")
	public String list() {
		return "/study/list";
	}

}
