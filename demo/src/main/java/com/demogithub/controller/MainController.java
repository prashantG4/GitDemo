package com.demogithub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	
	@GetMapping("/")
	public String home() {
		return "Hi, How are you?";
	}
	
	@GetMapping("/demo")
	public String demo() {
		return "This is demo request";
	}

}
