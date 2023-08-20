package com.yujin.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import com.yujin.dto.Request;
import com.yujin.dto.Resource;

@Component
@MapperScan
public interface NutrientMapper {
	public List<Resource> selectAll();
	
	public List<Resource> selectByRequest(Request request);
	
	public List<Resource> selectByFoodName(String name);
	public List<Resource> selectByResearchYear(int year);
	public List<Resource> selectByMakerName(String makerName);
	public List<Resource> selectByFoodCode(String foodCode);
	
}
