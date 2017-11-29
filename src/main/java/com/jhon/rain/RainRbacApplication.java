package com.jhon.rain;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@MapperScan("com.jhon.rain.dao")
@Controller
public class RainRbacApplication {

	public static void main(String[] args) {
		SpringApplication.run(RainRbacApplication.class, args);
	}

	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
