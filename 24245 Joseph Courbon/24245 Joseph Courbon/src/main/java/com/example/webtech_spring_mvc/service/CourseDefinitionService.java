package com.example.webtech_spring_mvc.service;

import com.example.webtech_spring_mvc.model.CourseDefinition;
import com.example.webtech_spring_mvc.model.Student;

import java.util.List;

public interface CourseDefinitionService {
    List<CourseDefinition> findAllCourseDefinitions();
    CourseDefinition saveCourseDefinition(CourseDefinition courseDefinition);
}
