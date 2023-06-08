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

    public List<Student> getStudents(){
        return this.students;
    }

    public List<Student> getStuByNames(String name){
        List<Student> students1 = (List<Student>) students.stream().filter(student -> student.getName().equals(name));
        return students1;
    }
}
