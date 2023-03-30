package com.qualwalk.monolith.web.controller;

import com.qualwalk.monolith.domain.dto.CorporateUserDto;
import com.qualwalk.monolith.web.service.CorporateUsersService;
import com.swantech.lang.core.domain.BaseResponse;
import com.swantech.lang.core.utility.ResponseUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/corporate")
public class CorporateRestController {

    @Autowired
    CorporateUsersService corporateUsersService;

//    @PreAuthorize("hasRole('ROLE_corporate_admin')")
    @PostMapping("/add-user")
    public ResponseEntity<BaseResponse<String>> createUser(
            @RequestBody CorporateUserDto corporateUserDto
            ) {
        corporateUsersService.addUser(corporateUserDto.getUser());
        return ResponseEntity.ok(ResponseUtility.createBaseResponse("SUCCESS"));
    }

}
