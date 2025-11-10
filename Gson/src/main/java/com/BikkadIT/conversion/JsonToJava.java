package com.BikkadIT.conversion;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.BikkadIT.binding.Student;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class JsonToJava {
	
	public static void main(String[] args) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		
		Gson gson = new Gson();
		Student fromJson = gson. fromJson(new FileReader("Student.json"), Student.class);
		System.out.println(fromJson);
		
		
		
		

	}
}
