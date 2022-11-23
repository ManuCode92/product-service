package com.nttdata.bootcamp.productservice.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlller {
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/port")
	
	public String getMicroServicePort() {
		String result = "El puerto del micro es: " + port;
		return result;
		
	}
	
	
}
