package com.BikkadIT.XmlAndJsonResponse.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.XmlAndJsonResponse.Student;

@RestController
public class StudentController {

	@GetMapping(value="/getStu",produces={"application/xml","application/json"})
	public ResponseEntity<Student> getStudent() {

		Student stu = new Student();
		stu.setSid(11);
		stu.setSname("Santosh");
		stu.setSaddr("Pune");
		return new ResponseEntity<Student>(stu,HttpStatus.OK);
		

	}
	
	@PostMapping(value="/saveStu",consumes={"application/xml","application/json"})
	public ResponseEntity<Student> saveStu(@RequestBody Student stu) {

		System.out.println(stu);
		return new ResponseEntity<Student>(stu,HttpStatus.CREATED);
		

	}
	
	
}
