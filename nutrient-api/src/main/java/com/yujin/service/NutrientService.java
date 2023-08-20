package com.yujin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.yujin.dto.Request;
import com.yujin.dto.Resource;
import com.yujin.mapper.NutrientMapper;

@Service
public class NutrientService {
	private NutrientMapper nutrientDAO;

	public List<Resource> getNutrients(Request request){
		return nutrientDAO.selectAll();
	}

	public List<Resource> selectByRequest(Request request){
		return nutrientDAO.selectByRequest(request);
	}
	
}
