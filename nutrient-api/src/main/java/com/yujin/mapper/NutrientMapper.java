package com.yujin.mapper;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Component;

import com.yujin.dto.Request;
import com.yujin.dto.Resource;

@Component
@MapperScan
public interface NutrientMapper {
	public List<Resource> getNutrientList(Request request);
}
