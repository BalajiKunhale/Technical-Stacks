package com.logger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class WelcomeController {
	
	// this is referance how to crate logger object referance variable
	private static Logger Logger = LoggerFactory.getLogger(WelcomeController.class);
	
	
	@GetMapping("/welcome")
	public String welcome (String name) {
		
		String startingPont = "this is the entry point for methos welcome ";
		Logger.info(startingPont);
		
		
		/*
		 * 
		 * method call
		 * declaration
		 * calling
		 * 
		 */
		
		
		String endingPont = "this is the exit point for methos welcome ";
		Logger.info(endingPont);
		
		return "Welcome John Snow";
		

	}	

}
