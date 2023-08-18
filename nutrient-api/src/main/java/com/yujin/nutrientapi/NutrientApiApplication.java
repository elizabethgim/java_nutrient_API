package com.yujin.nutrientapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value="com.yujin.mapper")
public class NutrientApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NutrientApiApplication.class, args);
	}
}
