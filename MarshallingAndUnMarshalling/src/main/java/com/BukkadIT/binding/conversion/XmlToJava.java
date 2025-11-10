package com.BukkadIT.binding.conversion;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.BukkadIT.binding.Student;

public class XmlToJava {
	
	public static void main(String[] args) throws JAXBException {
		
		JAXBContext context = JAXBContext.newInstance(Student.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Object unmarshal = unmarshaller.unmarshal (new File("Student.xml"));
		System.out.println(unmarshal);
		
		
		
	}

}
