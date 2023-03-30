package com.qualwalk.monolith.domain.model;

import com.qualwalk.monolith.domain.enums.UserType;
import lombok.Data;

@Data
public class IdentityDto {

    private String username;
    private String password;
    private UserType type;

}
