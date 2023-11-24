package com.example.webtech_spring_mvc.service;

import com.example.webtech_spring_mvc.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudents();
    Student saveStudent(Student student);
}
