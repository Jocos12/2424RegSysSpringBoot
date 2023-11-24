package com.example.webtech_spring_mvc.service.impl;

import com.example.webtech_spring_mvc.model.Student;
import com.example.webtech_spring_mvc.repository.StudentRepository;
import com.example.webtech_spring_mvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
