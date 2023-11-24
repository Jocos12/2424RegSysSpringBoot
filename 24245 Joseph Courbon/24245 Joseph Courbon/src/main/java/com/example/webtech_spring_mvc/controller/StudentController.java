package com.example.webtech_spring_mvc.controller;

import com.example.webtech_spring_mvc.model.Student;
import com.example.webtech_spring_mvc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.UUID;

@Controller
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/all_students")
    public String createStudentForm(Model model) {
        Student student = new Student();
        List<Student> studentsList = studentService.findAllStudents();
        model.addAttribute("studentsList", studentsList);
        model.addAttribute("student", student);
        return "students";
    }

    @PostMapping("/students/new")
    public String saveStudent(@ModelAttribute("student") Student student) {
        student.setStud_id(UUID.randomUUID());
        studentService.saveStudent(student);
        return "redirect:/all_students?success";
    }
}
