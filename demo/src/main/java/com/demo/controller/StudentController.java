package com.demo.controller;

import com.demo.model.Student;
import com.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/student")
public class StudentController {

    @Autowired
    StudentService studentService;
    @GetMapping(value = "/")
    public @ResponseBody List<Student> getstudents(){
        return studentService.getStudents();
    }
}
