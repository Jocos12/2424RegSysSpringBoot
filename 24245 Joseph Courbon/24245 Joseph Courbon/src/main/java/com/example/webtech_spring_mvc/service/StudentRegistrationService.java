package com.example.webtech_spring_mvc.service;

import com.example.webtech_spring_mvc.model.Student;
import com.example.webtech_spring_mvc.model.StudentRegistration;

import java.util.List;
import java.util.UUID;

public interface StudentRegistrationService {
    StudentRegistration createStudentRegistration(StudentRegistration studentRegistration);
    List<StudentRegistration> fetchAllStudentRegistration();
    List<Object[]> getStudents(String studRegNo);
    List<Object[]> getAllStudentsRequests();
    List<Object[]> getAcademicUnits();
    List<Object[]> getAllSemesters();
    Student findById(UUID stud_id);
    boolean rejectStudent(UUID regId);
    boolean admitStudent(UUID regId);
    StudentRegistration findByIdStudReg(UUID reg_id);
}
