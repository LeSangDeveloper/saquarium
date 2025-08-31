package com.sang.saquarium.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PoolController {

	@GetMapping("/")
	public String pool() {
		return "static/index";
	}
	
	@GetMapping("/edit")
	public String edit() {
		return "template/edit";
	}
	
}
