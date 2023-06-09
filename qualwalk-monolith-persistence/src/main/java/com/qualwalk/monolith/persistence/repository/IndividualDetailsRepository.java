package com.qualwalk.monolith.persistence.repository;

import com.qualwalk.monolith.persistence.entity.IndividualDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface IndividualDetailsRepository extends JpaRepository<IndividualDetailsEntity, Long> {

    Optional<IndividualDetailsEntity> findByUsername(String username);

}
