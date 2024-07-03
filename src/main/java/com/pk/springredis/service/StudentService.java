package com.pk.springredis.service;

import java.util.*;
import com.pk.springredis.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	
	public Student getStudentDetails(int studentId);
	
	public List<Student> getListOfAllStudents();
}
