package com.example.webtech_spring_mvc.service.impl;

import com.example.webtech_spring_mvc.model.CourseDefinition;
import com.example.webtech_spring_mvc.repository.CourseDefinitionRepository;
import com.example.webtech_spring_mvc.service.CourseDefinitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseDefinitionServiceImpl implements CourseDefinitionService {
    private CourseDefinitionRepository courseDefinitionRepository;

    @Autowired
    public CourseDefinitionServiceImpl(CourseDefinitionRepository courseDefinitionRepository) {
        this.courseDefinitionRepository = courseDefinitionRepository;
    }

    @Override
    public List<CourseDefinition> findAllCourseDefinitions() {
        List<CourseDefinition> courseDefinitions = courseDefinitionRepository.findAll();
        return courseDefinitions;
    }

    @Override
    public CourseDefinition saveCourseDefinition(CourseDefinition courseDefinition) {
        return courseDefinitionRepository.save(courseDefinition);
    }
}
