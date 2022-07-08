package com.springboot.actuator.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.actuator.helper.Student;

@RestController
public class HomeController {
	@Autowired
	private Student student;
		@GetMapping("/home")
		public Map<String,String> getData(){
			return Map.of("Name","Adnan");
		}
}
