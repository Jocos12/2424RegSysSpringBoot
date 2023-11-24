package com.example.webtech_spring_mvc.repository;

import com.example.webtech_spring_mvc.model.AcademicUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AcademicUnitRepository extends JpaRepository<AcademicUnit, UUID> {}
