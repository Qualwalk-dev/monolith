package com.qualwalk.monolith.web.service;

import com.qualwalk.monolith.domain.model.IdentityDto;
import com.qualwalk.monolith.domain.model.UserData;
import com.qualwalk.monolith.domain.model.ValidateOtp;
//import com.swantech.security.keycloak.dto.TokenDto;

public interface UserService {

    void createUser(UserData userData);

    boolean validateOtp(ValidateOtp validateOtp);

//    TokenDto updatePassword(IdentityDto identityDto);

//    TokenDto getToken(IdentityDto input);

}
