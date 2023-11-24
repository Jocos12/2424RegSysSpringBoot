package com.example.webtech_spring_mvc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "academic_unit")
public class AcademicUnit {
    @Id
    private UUID acc_id;
    private String acc_code;
    private String name;
    @Enumerated(EnumType.STRING)
    private EAcademicUnit unit;
}
