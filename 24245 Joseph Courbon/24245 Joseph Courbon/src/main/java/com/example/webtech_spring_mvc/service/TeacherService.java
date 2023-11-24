package com.example.webtech_spring_mvc.service;

import com.example.webtech_spring_mvc.model.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> findAllTeachers();
    Teacher saveTeacher(Teacher teacher);
}
