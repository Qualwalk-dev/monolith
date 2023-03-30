package com.qualwalk.monolith.persistence.entity;


import com.qualwalk.monolith.domain.enums.*;
import lombok.*;

import javax.persistence.*;
import java.math.*;

@Entity@Getter@Setter
@Table(name = "course")
public class CourseEntity {

    @Id
    private String course;

    @Column(name = "description")
    private String description;

    @Column(name = "original_price")
    private BigDecimal originalPrice;

    @Column(name = "final_price")
    private BigDecimal finalPrice;

    @Column(name = "discount")
    private BigDecimal discount;

    @Enumerated(EnumType.STRING)
    @Column(name = "course_category")
    private CourseCategory courseCategory;


}
