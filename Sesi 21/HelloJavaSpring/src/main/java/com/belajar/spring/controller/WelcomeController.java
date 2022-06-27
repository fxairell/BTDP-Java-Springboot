package com.belajar.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/welcome")
public class WelcomeController {
	@GetMapping("/index")
	public String mainHello() {
		return "Hello, belajar SpringBoot";
	}
}
