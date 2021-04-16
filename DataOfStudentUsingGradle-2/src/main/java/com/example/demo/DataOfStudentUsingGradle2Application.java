package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.Model.Student;
import com.example.repository.RequiredRepo;

@SpringBootApplication(scanBasePackages = "com.example")
@EnableAutoConfiguration
@EnableMongoRepositories("com.example.repository")
public class DataOfStudentUsingGradle2Application
{
	@Autowired
	RequiredRepo repo;
	public static void main(String[] args) {
		SpringApplication.run(DataOfStudentUsingGradle2Application.class, args);

	}
}
