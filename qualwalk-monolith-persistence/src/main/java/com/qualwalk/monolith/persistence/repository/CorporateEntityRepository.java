package com.qualwalk.monolith.persistence.repository;

import com.qualwalk.monolith.persistence.entity.CorporateEntity;
import com.qualwalk.monolith.persistence.entity.CorporateUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CorporateEntityRepository extends JpaRepository<CorporateEntity, Long> {

    Optional<CorporateEntity> findByOrgName(String orgName);

}
