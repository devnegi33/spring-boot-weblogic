package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	private static List<Student> studentList= null;
	
	static {
		studentList = Arrays.asList(new Student(123L,"Devender Negi","Noida"),new Student(124L,"Rajesh","Hydrdabad"));
	}
	
	public List<Student>getStudents(){
		return studentList;
	}

}
