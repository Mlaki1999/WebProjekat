package com.example.Projekat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller 
public class HomeController {

	@GetMapping("/")
	public String welcome(){
		return "index.html";
	}
}
