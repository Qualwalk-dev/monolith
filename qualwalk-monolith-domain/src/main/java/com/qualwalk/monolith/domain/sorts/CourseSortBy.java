package com.qualwalk.monolith.domain.sorts;

import java.util.*;

public enum CourseSortBy {
    COURSE("course"),
    ORIGINAL_PRICE("originalPrice"),
    DISCOUNT("discount"),
    FINAL_PRICE("finalPrice");


    private String ordinal;

    CourseSortBy(String ordinal) {
        this.ordinal = ordinal;
    }

    public static final Set<CourseSortBy> ALL = EnumSet.allOf(CourseSortBy.class);

    public String getOrdinal() {
        return ordinal;
    }
}
