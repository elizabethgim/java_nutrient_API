package com.yujin.nutrientapi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yujin.nutrientapi.dto.Resource;

@Mapper
public interface NutrientMapper {
	public List<Resource> selectAll();
	
//	public List<Resource> selectByRequest(Request request);
//	
//	public List<Resource> selectByFoodName(String name);
//	public List<Resource> selectByResearchYear(int year);
//	public List<Resource> selectByMakerName(String makerName);
//	public List<Resource> selectByFoodCode(String foodCode);
	
}
