package com.BukkadIT.binding.conversion;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.BukkadIT.binding.Student;

public class JavaToXml {
	
	public static void main(String[] args) throws JAXBException {
		
		Student stu = new Student();
		stu.setStudentId(111);
		stu.setStudentName("Balaji");
		stu.setStudentRank(111);
		stu.setStudentAge(34);
		System.out.println(stu);
		
		
		JAXBContext context = JAXBContext.newInstance(Student.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.marshal (stu, System.out);
	}
	

}
