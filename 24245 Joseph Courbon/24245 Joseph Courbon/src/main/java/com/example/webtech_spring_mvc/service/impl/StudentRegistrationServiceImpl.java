package com.example.webtech_spring_mvc.service.impl;

import com.example.webtech_spring_mvc.model.Student;
import com.example.webtech_spring_mvc.model.StudentRegistration;
import com.example.webtech_spring_mvc.repository.AcademicUnitRepository;
import com.example.webtech_spring_mvc.repository.SemesterRepository;
import com.example.webtech_spring_mvc.repository.StudentRegistrationRepository;
import com.example.webtech_spring_mvc.repository.StudentRepository;
import com.example.webtech_spring_mvc.service.StudentRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService {
    private StudentRegistrationRepository studentRegistrationRepository;
    private StudentRepository studentRepository;
    private AcademicUnitRepository academicUnitRepository;
    private SemesterRepository semesterRepository;

    @Autowired
    public StudentRegistrationServiceImpl(StudentRegistrationRepository studentRegistrationRepository, StudentRepository studentRepository, AcademicUnitRepository academicUnitRepository, SemesterRepository semesterRepository) {
        this.studentRegistrationRepository = studentRegistrationRepository;
        this.studentRepository = studentRepository;
        this.academicUnitRepository = academicUnitRepository;
        this.semesterRepository = semesterRepository;
    }

    @Override
    public StudentRegistration createStudentRegistration(StudentRegistration studentRegistration) {
        return studentRegistrationRepository.save(studentRegistration);
    }

    @Override
    public List<StudentRegistration> fetchAllStudentRegistration() {
        List<StudentRegistration> studentRegistrations = studentRegistrationRepository.findAll();
        return studentRegistrations;
    }

    @Override
    public List<Object[]> getStudents(String studRegNo) {
        return null;
    }

    @Override
    public List<Object[]> getAllStudentsRequests() {
        return null;
    }

    @Override
    public List<Object[]> getAcademicUnits() {
        return null;
    }

    @Override
    public List<Object[]> getAllSemesters() {
        return null;
    }

    @Override
    public Student findById(UUID stud_id) {
        return null;
    }

    @Override
    public boolean rejectStudent(UUID regId) {
        return false;
    }

    @Override
    public boolean admitStudent(UUID regId) {
        return false;
    }

    @Override
    public StudentRegistration findByIdStudReg(UUID reg_id) {
        return null;
    }
}
