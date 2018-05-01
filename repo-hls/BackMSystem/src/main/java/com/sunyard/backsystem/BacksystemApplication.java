package com.sunyard.backsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.sunyard.backsystem.dao.*")
public class BacksystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BacksystemApplication.class, args);
	}
}
