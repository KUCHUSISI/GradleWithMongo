package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Model.Student;

@Repository
public interface RequiredRepo extends MongoRepository<Student, String>{

	Student findByFirstName(String id);

}
