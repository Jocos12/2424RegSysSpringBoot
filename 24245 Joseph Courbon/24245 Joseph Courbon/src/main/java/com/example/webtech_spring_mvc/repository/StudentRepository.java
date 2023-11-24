package com.example.webtech_spring_mvc.repository;

import com.example.webtech_spring_mvc.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID> {}
