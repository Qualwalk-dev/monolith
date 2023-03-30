package com.qualwalk.monolith.web.controller;


import com.qualwalk.monolith.domain.dto.UserDto;
import com.qualwalk.monolith.domain.model.IdentityDto;
import com.qualwalk.monolith.domain.model.ValidateOtp;
import com.qualwalk.monolith.web.service.UserService;
import com.swantech.lang.core.domain.BaseResponse;
import com.swantech.lang.core.utility.ResponseUtility;
//import com.swantech.security.keycloak.dto.TokenDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController@Slf4j
@RequestMapping("/identity")
public class IdentityRestController {

//    @Autowired
//    UserService userService;
//
//    @PostMapping
//    public ResponseEntity<BaseResponse<String>> createUser(
//            @RequestBody UserDto userDto
//            ) {
//        this.userService.createUser(userDto.getUser());
//        return ResponseEntity.ok(ResponseUtility.createBaseResponse("SUCCESS"));
//    }
//
//    @PostMapping("/verify-user")
//    public ResponseEntity<BaseResponse<String>> validateOtp(@RequestBody @Valid ValidateOtp validateOtp) {
//        if(userService.validateOtp(validateOtp) ) {
//            return ResponseEntity.ok(ResponseUtility.createBaseResponse("SUCCESS"));
//        }else {
//            return new ResponseEntity<>(
//                    ResponseUtility.createUnauthorizedResponse("FAILURE"),
//                    HttpStatus.UNAUTHORIZED
//            );
//        }
//    }
//
//    @PutMapping("/update-password")
//    public ResponseEntity<BaseResponse<TokenDto>> updatePassword(@RequestBody IdentityDto passwordDto) {
//        try {
//            TokenDto tokenDto = userService.updatePassword(passwordDto);
//            return ResponseEntity.ok(ResponseUtility.createBaseResponse(tokenDto));
//        }catch (Exception e) {
//            log.error("An exception occurred while updating password {} ", e);
//            return new ResponseEntity(
//                    ResponseUtility.createUnauthorizedResponse(null),
//                    HttpStatus.UNAUTHORIZED
//            );
//        }
//    }
//
//    @PostMapping("/token")
//    public ResponseEntity<BaseResponse<TokenDto>> getToken(
//            @RequestBody IdentityDto identityDto
//    ) {
//        try {
//            TokenDto tokenDto = userService.getToken(identityDto);
//            return ResponseEntity.ok(ResponseUtility.createBaseResponse(tokenDto));
//        }catch (Exception e) {
//            log.error("An exception occurred while fetching token {} ", e);
//            return new ResponseEntity<>(
//                    ResponseUtility.createUnauthorizedResponse(null)
//                    , HttpStatus.UNAUTHORIZED
//            );
//        }
//    }


}
