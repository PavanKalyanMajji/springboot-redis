package com.pk.springredis.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pk.springredis.model.Student;
import com.pk.springredis.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepo repo;

	@Override
	public Student saveStudent(Student student) {
		return repo.save(student);
	}

	@Override
	public Student getStudentDetails(int studentId) {
		return repo.findById(studentId).orElse(null);
	}

	@Override
	public List<Student> getListOfAllStudents() {
		Iterator<Student> studentIterator=repo.findAll().iterator();
		List<Student> listOfAllStudents = new ArrayList<>();
		while(studentIterator.hasNext()) {
			listOfAllStudents.add(studentIterator.next());
		}
		return listOfAllStudents;
	}

}
