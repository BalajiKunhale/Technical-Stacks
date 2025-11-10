package com.BikkadIT.RestCrudOperation.repository;

import org.springframework.data.repository.CrudRepository;

import com.BikkadIT.RestCrudOperation.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>  {

}
