package com.jalal.springbootbasics.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/vi/student")
public class StudentController {
    @Autowired
    StudentService service;
    @GetMapping(path = "/all")
    public List<Student> getStudents(){
        return service.getStudents();
    }
}
