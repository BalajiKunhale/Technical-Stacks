package com.BikkadIT.conversion;

import com.BikkadIT.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJson {
	public static void main(String[] args) throws JsonProcessingException {
		
		Student stu = new Student();
		stu.setStudentId(111);
		stu.setStudentName("Santosh");
		stu.setStudentRank(1);
		stu.setStudentAge(30);
		System.out.println(stu);
		
		
		ObjectMapper objectMapper=new ObjectMapper();
		String json = objectMapper.writeValueAsString(stu);
		System.out.println(json);
		
		
		
	}

}
