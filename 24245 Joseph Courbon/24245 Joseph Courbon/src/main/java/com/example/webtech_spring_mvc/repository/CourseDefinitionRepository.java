package com.example.webtech_spring_mvc.repository;

import com.example.webtech_spring_mvc.model.CourseDefinition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseDefinitionRepository extends JpaRepository<CourseDefinition, UUID> {}
