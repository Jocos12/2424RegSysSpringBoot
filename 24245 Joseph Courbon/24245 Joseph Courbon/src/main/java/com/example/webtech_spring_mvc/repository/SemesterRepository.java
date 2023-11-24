package com.example.webtech_spring_mvc.repository;

import com.example.webtech_spring_mvc.model.Semester;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SemesterRepository extends JpaRepository<Semester, UUID> {}
