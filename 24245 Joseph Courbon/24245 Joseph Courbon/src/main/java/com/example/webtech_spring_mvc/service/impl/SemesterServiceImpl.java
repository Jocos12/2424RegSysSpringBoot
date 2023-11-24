package com.example.webtech_spring_mvc.service.impl;

import com.example.webtech_spring_mvc.model.Semester;
import com.example.webtech_spring_mvc.model.Student;
import com.example.webtech_spring_mvc.repository.SemesterRepository;
import com.example.webtech_spring_mvc.service.SemesterService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SemesterServiceImpl implements SemesterService {
    private SemesterRepository semesterRepository;

    public SemesterServiceImpl(SemesterRepository semesterRepository) {
        this.semesterRepository = semesterRepository;
    }


    @Override
    public List<Semester> findAllSemesters() {
        List<Semester> semesters = semesterRepository.findAll();
        return semesters;
    }

    @Override
    public Semester saveSemester(Semester semester) {
        return semesterRepository.save(semester);
    }
}
