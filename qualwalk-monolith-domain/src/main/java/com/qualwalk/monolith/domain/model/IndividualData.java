package com.qualwalk.monolith.domain.model;

import lombok.Data;

@Data
public class IndividualData {
    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String phoneNumber;
    private String organization;
    private Integer yearsOfExperience;
}
