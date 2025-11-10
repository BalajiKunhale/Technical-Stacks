package com.logger.controller;

//import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	private static org.slf4j.Logger logger = LoggerFactory.getLogger(WelcomeController.class);
	
	@GetMapping("/welcome")
	public String getAllLocation() {
		String entrypoint = "This is exit point for method getAllLocation";
		logger.info(entrypoint);
		
		
		
		String exitpoint = "This is entry point for method getAllLocation";
		logger.info(exitpoint);
		return "Welcome to Bikkad IT ";
		
		
	}
	

}
