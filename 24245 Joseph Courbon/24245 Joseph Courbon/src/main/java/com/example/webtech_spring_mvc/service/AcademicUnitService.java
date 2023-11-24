package com.example.webtech_spring_mvc.service;

import com.example.webtech_spring_mvc.model.AcademicUnit;

import java.util.List;
import java.util.UUID;

public interface AcademicUnitService {
    List<AcademicUnit> findAllAcademicUnits();
    AcademicUnit saveAcademicUnit(AcademicUnit academicUnit);
    AcademicUnit findAcademicUnitById(UUID id);
    void deleteAcademicUnit(UUID id);
}
