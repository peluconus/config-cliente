package com.practica.configcliente.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {
	
	@Value("${some.value}")
	private String config;
	
	@GetMapping("/config")
	public String myValue() {
		return this.config;
	}

}
