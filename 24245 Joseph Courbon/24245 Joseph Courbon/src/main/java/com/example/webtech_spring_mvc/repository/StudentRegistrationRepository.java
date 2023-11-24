package com.example.webtech_spring_mvc.repository;

import com.example.webtech_spring_mvc.model.StudentRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRegistrationRepository extends JpaRepository<StudentRegistration, UUID> {}
