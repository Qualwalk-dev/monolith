package com.qualwalk.monolith.domain.model;

import com.qualwalk.monolith.domain.enums.UserType;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Data
public class ValidateOtp {
    @NotNull
    private String username;

    @NotNull
    @Length(min = 6, max = 6)
    private String otp;

    private UserType type;
}
