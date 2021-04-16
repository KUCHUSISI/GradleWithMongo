package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Student;
import com.example.repository.RequiredRepo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@Service
public class Services 
{
	@Autowired
	RequiredRepo repo;
	
	public List<Student> getAllDetails()
	{
		List<Student> list=new ArrayList<Student>();
		List<Student> list1=repo.findAll();
		for(Student student:list1)
		{
//			System.out.println(student);
			list.add(student);
		}
		return list;
//		return repo.findAll();
	}
	public  Student getDetails(String Id)
	{
		return repo.findByFirstName(Id);
	}
	public void save(Student student)
	{
		repo.save(student);
	}
}