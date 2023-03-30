package com.qualwalk.monolith.domain.enums;

public enum UserType {
    INDIVIDUAL("INDIVIDUAL"),
    CORPORATE("CORPORATE");
    private String ordinal;

    UserType(String ordinal) {
        this.ordinal = ordinal;
    }
}
