package com.app.sportsinsight.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MainController {

	@RequestMapping()
	public void hello() {
		System.out.println("hello");
	}
	
}
