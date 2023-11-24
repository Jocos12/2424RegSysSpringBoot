package com.example.webtech_spring_mvc.service.impl;

import com.example.webtech_spring_mvc.model.AcademicUnit;
import com.example.webtech_spring_mvc.repository.AcademicUnitRepository;
import com.example.webtech_spring_mvc.service.AcademicUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
@Service
public class AcademicUnitImpl implements AcademicUnitService {
    private AcademicUnitRepository academicUnitRepository;

    @Autowired
    public AcademicUnitImpl(AcademicUnitRepository academicUnitRepository) {
        this.academicUnitRepository = academicUnitRepository;
    }

    @Override
    public List<AcademicUnit> findAllAcademicUnits() {
        List<AcademicUnit> academicUnits = academicUnitRepository.findAll();
        return academicUnits;
    }

    @Override
    public AcademicUnit saveAcademicUnit(AcademicUnit academicUnit) {
        return academicUnitRepository.save(academicUnit);
    }

    @Override
    public AcademicUnit findAcademicUnitById(UUID id) {
        return academicUnitRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteAcademicUnit(UUID id) {
        academicUnitRepository.deleteById(id);
    }
}

