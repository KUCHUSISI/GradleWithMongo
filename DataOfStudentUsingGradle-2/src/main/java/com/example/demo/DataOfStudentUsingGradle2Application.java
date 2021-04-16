package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.Model.Student;
import com.example.repository.RequiredRepo;

@EnableAutoConfiguration
@EnableMongoRepositories("com.example.repository")
@SpringBootApplication
public class DataOfStudentUsingGradle2Application implements CommandLineRunner
{
	@Autowired
	RequiredRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(DataOfStudentUsingGradle2Application.class, args);
	}
	public void run(String... args) throws Exception {
		Student s=new Student(7,"Chenepalli","niktha","9876543210");
		Student s1=new Student(8,"Kavya","Sree","9876543210");
		repo.save(s);
		repo.save(s1);
		List<Student> list=repo.findAll();
		for(Student student:list)
		{
			System.out.println(student.toString());
		}
		
	}

}
