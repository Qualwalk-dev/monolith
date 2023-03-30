package com.qualwalk.monolith.persistence.repository;


import com.qualwalk.monolith.domain.enums.*;
import com.qualwalk.monolith.persistence.entity.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface CourseCategoryRepository extends JpaRepository<CourseCategoryEntity, Long> {
}
