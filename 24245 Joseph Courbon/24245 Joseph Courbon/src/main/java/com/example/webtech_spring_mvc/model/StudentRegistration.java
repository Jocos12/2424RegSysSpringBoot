package com.example.webtech_spring_mvc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class StudentRegistration {
    @Id
    private UUID reg_id;
    @ManyToOne
    @JoinColumn(name = "student_stud_id")
    private Student student;
    @ManyToOne
    private AcademicUnit academicUnit;
    @ManyToOne
    private Semester semester;
    @Enumerated(EnumType.STRING)
    private ERegistrationStatus eRegistrationStatus;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate registrationDate;
}
