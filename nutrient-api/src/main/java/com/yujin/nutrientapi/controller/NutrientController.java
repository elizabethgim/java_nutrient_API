package com.yujin.nutrientapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yujin.nutrientapi.dto.Resource;
import com.yujin.nutrientapi.service.NutrientService;

@RestController
public class NutrientController {
	@Autowired
	private NutrientService nutrientService;
	
//	public NutrientController(NutrientService nutrientService) {
//		this.nutrientService = nutrientService;
//	}
	
//	public String show() {
//		return "hello";
//	}
	
	@GetMapping("/nutrients")
	public List<Resource> show(){
		return nutrientService.getNutrients();
	}
}
