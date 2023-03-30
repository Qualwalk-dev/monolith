package com.qualwalk.monolith.web.service;

import com.qualwalk.monolith.domain.criteria.*;
import com.qualwalk.monolith.domain.sorts.*;
import com.qualwalk.monolith.persistence.entity.*;
import com.qualwalk.monolith.persistence.repository.*;
import com.qualwalk.monolith.persistence.specification.*;
import com.swantech.lang.core.domain.*;
import com.swantech.lang.core.utility.*;
import io.reactivex.rxjava3.core.Observable;
import lombok.extern.slf4j.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.stereotype.*;

import javax.persistence.*;
import java.util.*;

@Slf4j
@Service
public class CourseService {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CourseCategoryRepository courseCategoryRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public Observable<BaseResponse<CourseEntity>> createCourse(CourseEntity courseEntity) {
        return Observable.just(ResponseUtility.createBaseResponse(courseRepository.save(courseEntity)));
    }

    public Observable<BaseResponse<List<CourseCategoryEntity>>> getCourseCategories() {
        return Observable.just(
                ResponseUtility.createBaseResponse(
                        courseCategoryRepository.findAll()
                )
        );
    }

    public Observable<BaseResponse<Page<CourseEntity>>> searchCourses(
            SearchCourseCriteria criteria
    ) {
        CourseSpecification courseSpecification = new CourseSpecification(criteria);
        Pageable pageable = PageRequest.of(
                criteria.getPageIndex(),
                criteria.getPageSize()
        );
        return Observable.just(
                ResponseUtility.createBaseResponse(
                        courseRepository.findAll(
                            courseSpecification,
                            pageable
                        )
                )
        );
    }




}
