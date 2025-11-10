package com.BikkadIT.RestCrudOperation.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.RestCrudOperation.entity.Student;
import com.BikkadIT.RestCrudOperation.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServiceI {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveOrUpdateRecord(Student stu) {
		Student save = studentRepository.save(stu);
		return save;
	}
	
	@Override
	public List<Student> saveAllStu(List<Student> stu) {
		List<Student> saveAll = (List <Student>)studentRepository.saveAll(stu);
		return saveAll;
	}

	@Override
	public Student getStuById(int sid) {
		Student byId = studentRepository.findById(sid).get();
		return byId;
	}

	@Override
	public List<Student> getStuBYMpk(List<Integer> ids) {
	List<Student> allById = (List<Student>)studentRepository.findAllById(ids);
		return allById;
	}

	@Override
	public List<Student> getAllStu() {
		List<Student>  all = (List<Student> )studentRepository.findAll();
		return null;
	}

	@Override
	public void deleteRecordById(int sid) {
		studentRepository.deleteById(sid);		
	}

	@Override
	public void deleteAllRecords() {
		studentRepository.deleteAll( );	
		
	}




}
