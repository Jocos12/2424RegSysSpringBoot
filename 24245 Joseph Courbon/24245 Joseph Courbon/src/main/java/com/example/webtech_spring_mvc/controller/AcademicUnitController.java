package com.example.webtech_spring_mvc.controller;

import com.example.webtech_spring_mvc.model.AcademicUnit;
import com.example.webtech_spring_mvc.service.AcademicUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.UUID;

@Controller
public class AcademicUnitController {
    private AcademicUnitService academicUnitService;

    @Autowired
    public AcademicUnitController(AcademicUnitService academicUnitService) {
        this.academicUnitService = academicUnitService;
    }

    @GetMapping("/academic_unit")
    public String createAcademicUnitForm(Model model) {
        AcademicUnit academicUnit = new AcademicUnit();
        List<AcademicUnit> academicUnits = academicUnitService.findAllAcademicUnits();
        model.addAttribute("academicUnits", academicUnits);
        model.addAttribute("academicUnit", academicUnit);
        return "academicunit";
    }

    @PostMapping("/academic_unit/new")
    public String saveAcademicUnit(@ModelAttribute("academicUnit") AcademicUnit academicUnit) {
        academicUnit.setAcc_id(UUID.randomUUID());
        academicUnitService.saveAcademicUnit(academicUnit);
        return "redirect:/academic_unit";
    }







    // Get mapping for the update form
    @GetMapping("/academic_unit/update/{id}")
    public String updateAcademicUnitForm(@PathVariable UUID id, Model model) {
        AcademicUnit academicUnit = academicUnitService.findAcademicUnitById(id);
        model.addAttribute("academicUnit", academicUnit);
        return "updateAcademic"; // Check if this matches your actual template file name
    }


    // Post mapping for processing the update
    @PostMapping("/academic_unit/update/{id}")
    public String updateAcademicUnit(@PathVariable UUID id, @ModelAttribute("academicUnit") AcademicUnit updatedAcademicUnit) {
        AcademicUnit existingAcademicUnit = academicUnitService.findAcademicUnitById(id);

        // Update the properties of the existing academic unit
        if (existingAcademicUnit != null) {
            existingAcademicUnit.setAcc_code(updatedAcademicUnit.getAcc_code());
            existingAcademicUnit.setName(updatedAcademicUnit.getName());
            existingAcademicUnit.setUnit(updatedAcademicUnit.getUnit());

            // Save the updated academic unit
            academicUnitService.saveAcademicUnit(existingAcademicUnit);
        }

        return "redirect:/academic_unit";
    }


    // Delete Academic Unit
    @GetMapping("/academic_unit/delete/{id}")
    public String deleteAcademicUnit(@PathVariable UUID id) {
        academicUnitService.deleteAcademicUnit(id);
        return "redirect:/academic_unit";
    }
}