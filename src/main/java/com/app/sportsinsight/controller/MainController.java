package com.app.sportsinsight.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@EnableAutoConfiguration
public class MainController {

	@GetMapping("/")
	public ResponseEntity<String> hello() {
		System.out.println("hello");
		
		return ResponseEntity.ok("\"hello\"");//When sending a plain string object if this is not done then incorrect JSON will be sent in response
	}
	
}
