package com.qualwalk.monolith.persistence.entity;

import com.qualwalk.monolith.domain.enums.*;
import lombok.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity@Getter@Setter
@Table(name = "course_category")
public class CourseCategoryEntity {

    @Id
    @Enumerated(EnumType.STRING)
    @Column(name = "category")
    private CourseCategory category;

    @Column(name = "description")
    private String description;
}
