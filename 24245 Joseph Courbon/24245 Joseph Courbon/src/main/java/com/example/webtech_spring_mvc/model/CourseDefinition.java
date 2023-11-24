package com.example.webtech_spring_mvc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class CourseDefinition {
    @Id
    private UUID course_def_id;
    private String course_def_code;
    private String course_name;
    private String course_description;
}
