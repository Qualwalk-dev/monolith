package com.qualwalk.monolith.domain.model;

import lombok.Data;

@Data
public class CorporateData {
    private String orgName;
    private String username;
    private String email;
    private Boolean isAdmin;
}
