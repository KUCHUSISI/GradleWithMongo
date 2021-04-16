package com.example.Model;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.core.serializer.Deserializer;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Student //implements Deserializer<Student>
{
	public int id;
	public String firstName;
	public String lastName;
	public String mobileNo;
}