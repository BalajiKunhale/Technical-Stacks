package com.BikkadIT.FirstRestApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetController")
public class GreetController {
	
	@GetMapping("/grtMsg")
	public String greetMsg() {
	//public ResponseEntity<String> greetMsg() {
		String msg = "Good Evening Govinda";		
		
	    return msg;	
		//return new ResponseEntity<String> (msg,HttpStatus.OK) ;	
		
	}
	
	@GetMapping("/grtMsg1")
	public String greetMsg1() {
		String msg = "Good Night Govinda";		
		
		return msg;				
	}


}
