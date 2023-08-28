package com.yujin.nutrientapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yujin.nutrientapi.dto.Request;
import com.yujin.nutrientapi.dto.Resource;
import com.yujin.nutrientapi.mapper.NutrientMapper;

@Service
public class NutrientService {
	@Autowired
	private NutrientMapper nutrientmapper;

	public List<Resource> getNutrients(){
		return nutrientmapper.selectAll();
	}

//	public List<Resource> selectByRequest(Request request){
//		return nutrientDAO.selectByRequest(request);
//	}
	
}
