package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping(path = "/getUserName")
	public void getMessage()
	{
		System.out.println("User Name is Anjani ");
	}

}
