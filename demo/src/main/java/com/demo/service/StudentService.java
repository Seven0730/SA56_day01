package com.demo.service;

import com.demo.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<Student>();

    public StudentService(){
        students.add(new Student("hanwen","123"));

    }
}
