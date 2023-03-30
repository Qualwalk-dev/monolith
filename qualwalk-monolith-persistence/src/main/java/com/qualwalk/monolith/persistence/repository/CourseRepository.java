package com.qualwalk.monolith.persistence.repository;

import com.qualwalk.monolith.persistence.entity.*;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface CourseRepository extends JpaRepository<CourseEntity, String> {

    Page<CourseEntity> findAll(Specification<CourseEntity> specification, Pageable pageable);
}
