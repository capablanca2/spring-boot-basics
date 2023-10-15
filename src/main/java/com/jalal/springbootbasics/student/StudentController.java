package com.jalal.springbootbasics.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping(path = "/add")
    public Student addSudent(@RequestBody Student student){
        return service.addStudent(student);
    }
}
