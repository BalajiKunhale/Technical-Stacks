
package com.BikkadIT.RestCrudOperation.service;

import com.BikkadIT.RestCrudOperation.entity.Student;
import java.util.List;

public interface StudentServiceI {
	
	public Student saveOrUpdateRecord(Student stu);
	
	public List<Student> saveAllStu(List<Student> stu);
	
	public Student getStuById(int sid);
	
	public List<Student> getStuBYMpk( List<Integer> ids);
	
	public List<Student> getAllStu();
	
	public void deleteRecordById(int sid);
	
	public void deleteAllRecords( );


}
