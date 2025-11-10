package com.BikkadIT.conversion;

import com.BikkadIT.binding.Student;
import com.google.gson.Gson;


public class JavaToJson {
	
	public static void main(String[] args) {
		
		Student stu= new Student();
		stu.setSid(111);
		stu.setSname("Santosh");
		stu.setSrank(1);
		stu.setSage(30);
		
		System.out.println(stu);
		
		Gson gson = new Gson();
		String json  = gson.toJson(stu);
		System.out.println(json);
	}

}
