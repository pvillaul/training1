package com.example.training1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class Training1Application {
	
	@RequestMapping("/")
	@ResponseBody
	String message() {
		return "Welcome Guys!!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Training1Application.class, args);
	}
}
