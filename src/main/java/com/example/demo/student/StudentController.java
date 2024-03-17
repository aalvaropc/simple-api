package com.example.demo.student;
import com.example.demo.student.Student;


import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return  studentService.getStudents();
    }

    @PostMapping("/students")
    public void postStudents(@RequestBody Student student){
       studentService.addStudent(student);
    }
}
