package com.yujin.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yujin.dto.Request;
import com.yujin.dto.Resource;
import com.yujin.service.NutrientService;

@RestController
public class NutrientController {
	private NutrientService nutrientService;
	
	public NutrientController(NutrientService nutrientService) {
		this.nutrientService = nutrientService;
	}
	
	@GetMapping("/nutrients")
	public List<Resource> show(@RequestParam Request request){
		return nutrientService.getNutrients(request);
	}
}
