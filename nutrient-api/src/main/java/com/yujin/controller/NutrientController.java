package com.yujin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NutrientController {
	@GetMapping("/index")
	public String index() {
		return "index";
	}
		
}
