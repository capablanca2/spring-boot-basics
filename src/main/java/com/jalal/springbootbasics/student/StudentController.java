package com.jalal.springbootbasics.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping(path = "/findByEmail")
    public Optional<Student> findByEmail(@RequestParam String email){
        return service.findByEmail(email);
    }
}
