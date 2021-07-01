package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Autowired
	private StudentService service;
	@Autowired
	private StudentConfiguation config;

	@GetMapping("/student")
	public String getStudentsInfo() {
		System.out.println(" Values from file : -> " +config.getEnv() +"-> " +config.getName());
		return config.getEnv()  +"::" +config.getName();
	}

}
