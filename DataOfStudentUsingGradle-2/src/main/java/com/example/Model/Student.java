package com.example.Model;

public class Student {
	int id;
	String firstName;
	String lastName;
	String mobileNo;
	public Student(int id, String firstName, String lastName, String mobileNo) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", mobileNo=" + mobileNo
				+ "]";
	}

}
