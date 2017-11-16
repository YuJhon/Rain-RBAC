package com.jhon.rain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jhon.rain.mapper")
public class RainRbacApplication {

	public static void main(String[] args) {
		SpringApplication.run(RainRbacApplication.class, args);
	}
}
