package com.example.webtech_spring_mvc.service;

import com.example.webtech_spring_mvc.model.Semester;

import java.util.List;

public interface SemesterService {
    List<Semester> findAllSemesters();
    Semester saveSemester(Semester semester);
}
