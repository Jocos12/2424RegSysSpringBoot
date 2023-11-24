package com.example.webtech_spring_mvc.controller;

import com.example.webtech_spring_mvc.service.StudentRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentRegistrationController {
    private StudentRegistrationService studentRegistrationService;

    @Autowired
    public StudentRegistrationController(StudentRegistrationService studentRegistrationService) {
        this.studentRegistrationService = studentRegistrationService;
    }
}
