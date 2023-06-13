package com.yedam.app;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.yedam.app.**.mapper")
public class Ex230613Application {

	public static void main(String[] args) {
		SpringApplication.run(Ex230613Application.class, args);
	}

}
