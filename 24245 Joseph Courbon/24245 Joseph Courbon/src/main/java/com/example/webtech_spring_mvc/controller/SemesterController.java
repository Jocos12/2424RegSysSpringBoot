package com.example.webtech_spring_mvc.controller;

import com.example.webtech_spring_mvc.model.Semester;
import com.example.webtech_spring_mvc.service.SemesterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.UUID;

@Controller
public class SemesterController {
    private SemesterService semesterService;

    @Autowired
    public SemesterController(SemesterService semesterService) {
        this.semesterService = semesterService;
    }

    @GetMapping("/all_semesters")
    public String createStudentForm(Model model) {
        Semester semester = new Semester();
        List<Semester> semesterList = semesterService.findAllSemesters();
        model.addAttribute("semestersList", semesterList);
        model.addAttribute("semester", semester);
        return "semesters";
    }

    @PostMapping("/semesters/new")
    public String saveStudent(@ModelAttribute("semester") Semester semester) {
        semester.setSem_id(UUID.randomUUID());
        semesterService.saveSemester(semester);
        return "redirect:/all_semesters?success";
    }
}
