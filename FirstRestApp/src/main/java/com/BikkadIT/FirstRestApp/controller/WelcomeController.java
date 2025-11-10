package com.BikkadIT.FirstRestApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcomeController")
public class WelcomeController {
	
	@GetMapping("/welMsg")
	  public String welMsg() {
	//public ResponseEntity<String> welMsg() {
		String msg = "Welcome Govinda";			
		
		return msg;			
		//return new ResponseEntity<String> (msg,HttpStatus.OK) ;
	}
	
	
	
	@GetMapping("/welMsg1")
	public String welMsg1() {
		String msg = "Welcome Gova";
				
		return msg;		
	}


}
