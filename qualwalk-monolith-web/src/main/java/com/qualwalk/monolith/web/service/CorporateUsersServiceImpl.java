package com.qualwalk.monolith.web.service;

import com.qualwalk.monolith.domain.model.CorporateUserData;
import com.qualwalk.monolith.persistence.entity.CorporateEntity;
import com.qualwalk.monolith.persistence.entity.CorporateUserEntity;
import com.qualwalk.monolith.persistence.repository.CorporateEntityRepository;
import com.qualwalk.monolith.persistence.repository.CorporateUserEntityRepository;
//import com.swantech.security.keycloak.service.KeycloakService;
import org.keycloak.representations.idm.CredentialRepresentation;
import org.keycloak.representations.idm.UserRepresentation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CorporateUsersServiceImpl implements CorporateUsersService {

//    @Autowired
//    KeycloakService keycloakService;
//
//    @Autowired
//    CorporateEntityRepository corporateEntityRepository;
//
//    @Autowired
//    CorporateUserEntityRepository corporateUserEntityRepository;
//
    @Override
    public void addUser(CorporateUserData corporateUserData) {
//        try{
//            this.addCorporateUserToKeycloak(corporateUserData);
//        }catch (Exception e) {
//            throw e;
//        }
//        String corporateName = RequestContextHolder
//                .getRequestAttributes()
//                .getAttribute("organization", 0).toString();
//        CorporateEntity entity = this.corporateEntityRepository.findByOrgName(
//                corporateName
//        ).orElseThrow(()-> new RuntimeException("Unable to find org with name "+corporateName));
//        CorporateUserEntity corporateUserEntity = new CorporateUserEntity();
//        corporateUserEntity.setOrganization(entity);
//        corporateUserEntity.setUsername(corporateUserData.getUsername());
//        corporateUserEntity.setIsAdmin(false);
//        corporateUserEntity.setEmail(corporateUserData.getEmail());
//        this.corporateUserEntityRepository.save(corporateUserEntity);
//
//

    }
//
//    private void addCorporateUserToKeycloak(CorporateUserData corporateUserData){
//        UserRepresentation userRepresentation = new UserRepresentation();
//        userRepresentation.setUsername(corporateUserData.getUsername());
//        userRepresentation.setEmail(corporateUserData.getEmail());
//        Map<String, List<String>> attributes = new HashMap<>();
//        attributes.put("ORGANIZATION",
//                Collections.singletonList(RequestContextHolder
//                        .currentRequestAttributes()
//                        .getAttribute("organization", 0).toString()));
//        userRepresentation.setAttributes(attributes);
//        CredentialRepresentation credentialRepresentation = new CredentialRepresentation();
//        credentialRepresentation.setTemporary(true);
//        credentialRepresentation.setType("password");
//        credentialRepresentation.setValue(corporateUserData.getUsername());
//        userRepresentation.setCredentials(Collections.singletonList(credentialRepresentation));
//        UserRepresentation createdUser = keycloakService.createUser(userRepresentation);
//        this.keycloakService.assignRoleToUser(createdUser.getId(), "corporate_user");
//    }
}
