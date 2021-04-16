package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Student;
import com.example.service.Services;

@RestController
public class ControllerClass 
{
	@Autowired
	Services service;	
	@GetMapping("/getdetails")
	public List getallDetails()
	{
		System.out.println("i am in Controller");
		return service.getAllDetails();
	}
	@GetMapping("/getdetails/{id}")
	public Student getdata(@PathVariable("id") String id)
	{
		return service.getDetails(id);
	}
	@PostMapping("/savestudent")
	public void save(@RequestBody Student student)
	{
		service.save(student);
	}
}
 