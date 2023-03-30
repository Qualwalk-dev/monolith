package com.qualwalk.monolith.web.service;

import com.qualwalk.monolith.domain.enums.UserType;
import com.qualwalk.monolith.domain.model.*;
import com.qualwalk.monolith.persistence.entity.CorporateEntity;
import com.qualwalk.monolith.persistence.entity.CorporateUserEntity;
import com.qualwalk.monolith.persistence.entity.IndividualDetailsEntity;
import com.qualwalk.monolith.persistence.entity.UsersEntity;
import com.qualwalk.monolith.persistence.repository.CorporateEntityRepository;
import com.qualwalk.monolith.persistence.repository.CorporateUserEntityRepository;
import com.qualwalk.monolith.persistence.repository.IndividualDetailsRepository;
import com.qualwalk.monolith.web.mapper.UserMapper;
//import com.swantech.security.keycloak.dto.TokenDto;
//import com.swantech.security.keycloak.mapper.TokenMapper;
//import com.swantech.security.keycloak.service.KeycloakService;
//import com.swantech.security.keycloak.util.KeycloakConstants;
import lombok.extern.slf4j.Slf4j;
import org.keycloak.representations.AccessTokenResponse;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.*;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    CorporateEntityRepository corporateEntityRepository;

    @Autowired
    CorporateUserEntityRepository corporateUserEntityRepository;

    @Autowired
    IndividualDetailsRepository individualDetailsRepository;

    @Autowired
    UserMapper userMapper;

//    @Autowired
//    KeycloakService keycloakService;
//
//    @Autowired
//    TokenMapper tokenMapper;

    @Override
    public void createUser(UserData userData) {
//        UserRepresentation createdUser = keycloakService
//                .createUser(this.getUserRepresentation(userData));
//
//        if( userData.getUserType().equals(UserType.INDIVIDUAL) ) {
//            try {
//                keycloakService.assignRoleToUser(createdUser.getId(), "guest");
//            }catch (Exception e) {
//                log.error("An exception occurred while creating user {}", e);
//                throw e;
//            }
//            IndividualDetailsEntity entity = userMapper.toEntity(userData.getIndividualData());
//            UsersEntity user = new UsersEntity();
//            user.setIsVerified(false);
//            user.setType(UserType.INDIVIDUAL);
//            entity.setUser(user);
//            this.individualDetailsRepository.save(entity);
//        }else {
//            try {
//                keycloakService.assignRoleToUser(createdUser.getId(), "guest");
//            }catch (Exception e) {
//                log.error("An exception occurred while creating user {}", e);
//                throw e;
//            }
//            CorporateData corporateData = userData.getCorporateData();
//            UsersEntity usersEntity = new UsersEntity();
//            usersEntity.setIsVerified(false);
//            usersEntity.setType(UserType.CORPORATE);
//            CorporateEntity organization = new CorporateEntity();
//            organization.setOrgName(corporateData.getOrgName());
//            organization.setUser(usersEntity);
//            CorporateEntity savedEntity = this.corporateEntityRepository.save(organization);
//            CorporateUserEntity corporateUserEntity = new CorporateUserEntity();
//            corporateUserEntity.setUsername(corporateData.getUsername());
//            corporateUserEntity.setIsAdmin(true);
//            corporateUserEntity.setEmail(corporateData.getEmail());
//            corporateUserEntity.setOrganization(savedEntity);
//
//            this.corporateUserEntityRepository.save(corporateUserEntity);
//        }

    }

    @Override
    @Transactional
    public boolean validateOtp(ValidateOtp input) {
        return this.validateIndividual(input);
    }

//    @Override
//    public TokenDto updatePassword(IdentityDto identityDto) {
//        return this.updateIndividualPassword(identityDto);
//    }

    // todo: refactor
    private UserRepresentation getUserRepresentation(UserData userData) {
        UserRepresentation userRepresentation = new UserRepresentation();
        if( userData.getUserType().equals(UserType.INDIVIDUAL) ){
            IndividualData savedCustomer = userData.getIndividualData();
            userRepresentation.setUsername(savedCustomer.getUsername());
            userRepresentation.setEmail(savedCustomer.getEmail());
            Map<String, List<String>> attributes = new HashMap<>();
            String otp = generateOtp();
            attributes.put("OTP", Collections.singletonList(otp));
            attributes.put("OTP_EXPIRY_TIME", Collections.singletonList(LocalDateTime.now().plusMinutes(3).toString()));
            userRepresentation.setAttributes(attributes);
        }else {
            CorporateData savedCustomer = userData.getCorporateData();
            userRepresentation.setUsername(savedCustomer.getUsername());
            userRepresentation.setEmail(savedCustomer.getEmail());
            Map<String, List<String>> attributes = new HashMap<>();
            String otp = generateOtp();
            attributes.put("OTP", Collections.singletonList(otp));
            attributes.put("OTP_EXPIRY_TIME", Collections.singletonList(LocalDateTime.now().plusMinutes(3).toString()));
            attributes.put("ORGANIZATION", Collections.singletonList(userData.getCorporateData().getOrgName()));
            userRepresentation.setAttributes(attributes);
        }
        return userRepresentation;
    }

    // todo: refactor
    private boolean validateIndividual(ValidateOtp input) {
//        try {
//            UserRepresentation userRepresentation = this.keycloakService
//                    .getUserByUsername(input.getUsername());
//            Map<String, List<String>> attributes = userRepresentation.getAttributes();
//            String otpAttribute = attributes.get(KeycloakConstants.OTP).isEmpty() ? ""
//                    : attributes.get(KeycloakConstants.OTP).get(0);
//            String otpExpiryTime = attributes.get(KeycloakConstants.OTP_EXPIRY_TIME).isEmpty() ?
//                    "" : attributes.get(KeycloakConstants.OTP_EXPIRY_TIME).get(0);
//            Object entity = input.getType().equals(UserType.INDIVIDUAL) ?
//                    individualDetailsRepository
//                            .findByUsername(input.getUsername())
//                            .orElse(null) :
//                    corporateUserEntityRepository.findByUsername(input.getUsername())
//                            .orElse(null);
//            if( otpAttribute.isEmpty() || otpExpiryTime.isEmpty() || Objects.isNull(entity) ) {
//                throw new RuntimeException("There is no otp created for user with username "+input.getUsername());
//            }
//            LocalDateTime otpExpiresAt = LocalDateTime.parse(otpExpiryTime);
//
//            if( otpAttribute.equalsIgnoreCase(input.getOtp()) &&
//                    otpExpiresAt.isAfter(LocalDateTime.now()) ) {
//                if( input.getType().equals(UserType.INDIVIDUAL) ) {
//                    IndividualDetailsEntity savedEntity = (IndividualDetailsEntity)entity;
//                    keycloakService.enableUser(userRepresentation.getId());
//                    keycloakService.assignRoleToUser(userRepresentation.getId(), "user");
//                    savedEntity.getUser().setIsVerified(true);
//                    individualDetailsRepository.save(savedEntity);
//                    keycloakService.removeGuestRole(userRepresentation.getId());
//                }else {
//                    CorporateUserEntity savedEntity = (CorporateUserEntity) entity;
//                    keycloakService.enableUser(userRepresentation.getId());
//                    keycloakService.assignRoleToUser(userRepresentation.getId(), "corporate_admin");
//                    savedEntity.getOrganization().getUser().setIsVerified(true);
//                    corporateUserEntityRepository.save(savedEntity);
//                    keycloakService.removeGuestRole(userRepresentation.getId());
//                }
//            }else {
//                throw new RuntimeException("OTP verification failed");
//            }
//
//            return true;
//        }catch (Exception e){
//            log.error("An exception occurred while validating otp {} ", e);
//            return false;
//        }
        return false;
    }

    private String generateOtp() {
        String numbers = "1234567890";
        Random random = new Random();
        char[] otp = new char[6];

        for(int i = 0; i< 6 ; i++) {
            otp[i] = numbers.charAt(random.nextInt(numbers.length()));
        }
        return new String(otp);
    }

//    private TokenDto updateIndividualPassword(IdentityDto input){
//        this.keycloakService.updatePassword(input.getUsername(), input.getPassword());
//        return this.getToken(input);
//    }

//    @Override
//    public TokenDto getToken(IdentityDto input) {
//        AccessTokenResponse accessTokenResponse = this.keycloakService.getAccessTokenResponse(
//                input.getUsername(),
//                input.getPassword()
//        );
//        return tokenMapper.toTokenDto(accessTokenResponse);
//    }
}
