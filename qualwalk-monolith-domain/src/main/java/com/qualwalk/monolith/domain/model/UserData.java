package com.qualwalk.monolith.domain.model;

import com.qualwalk.monolith.domain.enums.UserType;
import lombok.Data;

@Data
public class UserData {
    private UserType userType;
    private IndividualData individualData;
    private CorporateData corporateData;
}
