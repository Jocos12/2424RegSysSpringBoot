package com.example.webtech_spring_mvc.controller;

import com.example.webtech_spring_mvc.model.CourseDefinition;
import com.example.webtech_spring_mvc.model.Student;
import com.example.webtech_spring_mvc.service.CourseDefinitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.UUID;

@Controller
public class CourseDefinitionController {
    private CourseDefinitionService courseDefinitionService;

    @Autowired
    public CourseDefinitionController(CourseDefinitionService courseDefinitionService) {
        this.courseDefinitionService = courseDefinitionService;
    }

    @GetMapping("/all_courseDefinitions")
    public String createCourseDefinitionForm(Model model) {
        CourseDefinition courseDefinition = new CourseDefinition();
        List<CourseDefinition> courseDefinitionList = courseDefinitionService.findAllCourseDefinitions();
        model.addAttribute("courseDefinitionList", courseDefinitionList);
        model.addAttribute("courseDefinition", courseDefinition);
        return "coursedefinition";
    }

    @PostMapping("/courseDefinitions/new")
    public String saveStudent(@ModelAttribute("courseDefinition") CourseDefinition courseDefinition) {
        courseDefinition.setCourse_def_id(UUID.randomUUID());
        courseDefinitionService.saveCourseDefinition(courseDefinition);
        return "redirect:/all_courseDefinitions?success";
    }
}
