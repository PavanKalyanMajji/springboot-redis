package com.pk.springredis.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pk.springredis.model.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer>{

}
