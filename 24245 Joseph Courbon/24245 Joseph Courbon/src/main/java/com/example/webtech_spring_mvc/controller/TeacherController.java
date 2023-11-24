package com.example.webtech_spring_mvc.controller;

import com.example.webtech_spring_mvc.model.Student;
import com.example.webtech_spring_mvc.model.Teacher;
import com.example.webtech_spring_mvc.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.UUID;

@Controller
public class TeacherController {
    private TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/all_teachers")
    public String createTeacherForm(Model model) {
        Teacher teacher = new Teacher();
        List<Teacher> teacherList = teacherService.findAllTeachers();
        model.addAttribute("teacherList", teacherList);
        model.addAttribute("teacher", teacher);
        return "teachers";
    }

    @PostMapping("/teachers/new")
    public String saveTeacher(@ModelAttribute("student") Teacher teacher) {
        teacher.setTeach_id(UUID.randomUUID());
        teacherService.saveTeacher(teacher);
        return "redirect:/all_teachers?success";
    }
}
