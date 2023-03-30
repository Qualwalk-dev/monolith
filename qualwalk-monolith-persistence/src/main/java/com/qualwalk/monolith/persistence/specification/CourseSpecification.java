package com.qualwalk.monolith.persistence.specification;

import com.qualwalk.monolith.domain.criteria.*;
import com.qualwalk.monolith.persistence.entity.*;
import lombok.*;
import org.springframework.data.jpa.domain.*;

import javax.persistence.criteria.*;
import java.util.*;

@AllArgsConstructor
public class CourseSpecification implements Specification<CourseEntity> {

    private final SearchCourseCriteria criteria;

    @Override
    public Specification<CourseEntity> and(Specification<CourseEntity> other) {
        return Specification.super.and(other);
    }

    @Override
    public Specification<CourseEntity> or(Specification<CourseEntity> other) {
        return Specification.super.or(other);
    }

    @Override
    public Predicate toPredicate(Root<CourseEntity> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        List<Predicate> predicates = new LinkedList<>();

        if( Objects.nonNull(criteria.getCategory()) ) {
            predicates.add(
                criteriaBuilder.equal(root.get("courseCategory"), criteria.getCategory())
            );
        }

        if( Objects.nonNull(criteria.getCourse()) ) {
            predicates.add(
                    criteriaBuilder.like(
                         criteriaBuilder.lower(
                                 root.get("course")
                         ), "%"+criteria.getCourse().toLowerCase()+"%"
                    )
            );

        }


        return query
                .where(criteriaBuilder.and(predicates.toArray(new Predicate[0])))
                .distinct(true)
                .getRestriction();
    }
}
