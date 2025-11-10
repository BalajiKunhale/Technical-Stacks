package com.BikkadIT.RestCrudOperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.RestCrudOperation.entity.Student;
import com.BikkadIT.RestCrudOperation.service.StudentServiceI;

@RestController
public class StudentController {
	@Autowired
	private StudentServiceI studentServiceI;
	
	@PostMapping(value = "/saveStu", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Student> saveOrUpdateRecord(@RequestBody Student stu) {
		Student saveOrUpdateRecord = studentServiceI.saveOrUpdateRecord(stu);

		return new ResponseEntity<Student>(saveOrUpdateRecord, HttpStatus.OK);


	}

	@PostMapping(value = "/saveAllStu", consumes = "application/json", produces = "application/json")
	public ResponseEntity<List<Student >> saveAllStu(@RequestBody List<Student> stu) {
		List<Student > saveAllStu = studentServiceI.saveAllStu(stu);
		return new ResponseEntity<List<Student>> (saveAllStu,HttpStatus.CREATED );
	
	}
	
	@GetMapping("/getStu/{id}")
	public  ResponseEntity<Student> getStuBYMpk(@PathVariable Integer id ){
		Student stuById = studentServiceI.getStuById(id);		
		return new ResponseEntity<Student> (stuById,HttpStatus.OK );
		
	}
	
	
	
	@GetMapping(value="/getAllStumpk")
	public  ResponseEntity<List<Student>>getAllRecordsmpk(@RequestBody List<Integer> ids){
		List<Student> allStu = studentServiceI.getStuBYMpk(ids);
		return new ResponseEntity<List<Student>> (allStu ,HttpStatus.OK);
		
	}
	
	
	@GetMapping(value="/getAllStu")
	public  ResponseEntity<List<Student>>getAllRecords(){
		List<Student> allStu = studentServiceI.getAllStu();
		return new ResponseEntity<List<Student>> (allStu ,HttpStatus.OK);
		
	}
	
	
	@DeleteMapping("/deletebyId{sid}")
	public void deleteRecordById(int sid) {
		studentServiceI.deleteRecordById(sid);
	}
	
	
	@DeleteMapping("/deleteAll")
	public void deleteRecords( ) {
		studentServiceI.deleteAllRecords();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
