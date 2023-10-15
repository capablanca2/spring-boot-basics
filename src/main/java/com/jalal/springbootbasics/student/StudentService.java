package com.jalal.springbootbasics.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository repo;
    public List<Student> getStudents(){
        return repo.findAll();
    }
    public Student addStudent(Student student){
        return repo.save(student);
    }
}
