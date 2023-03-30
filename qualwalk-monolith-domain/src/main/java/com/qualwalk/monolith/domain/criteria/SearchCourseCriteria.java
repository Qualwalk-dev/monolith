package com.qualwalk.monolith.domain.criteria;

import com.fasterxml.jackson.annotation.*;
import com.qualwalk.monolith.domain.enums.*;
import com.qualwalk.monolith.domain.sorts.*;
import com.swantech.lang.core.domain.*;
import lombok.*;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchCourseCriteria extends BaseSearchCriteria<CourseSortBy> {

    private CourseCategory category;

    private String course;

    private Integer pageIndex;

    private Integer pageSize;



}
