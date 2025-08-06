package com.fintecho.littleforest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fintecho.littleforest.dao")
public class J070409001Application {

	public static void main(String[] args) {
		SpringApplication.run(J070409001Application.class, args);
	}

}
