package com.qualwalk.monolith.web.controller;

import com.qualwalk.monolith.domain.criteria.*;
import com.qualwalk.monolith.persistence.entity.*;
import com.qualwalk.monolith.web.service.*;
import com.swantech.lang.core.domain.*;
import io.reactivex.rxjava3.schedulers.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.data.domain.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.async.*;

import java.util.*;


@RestController
@RequestMapping("/course")
public class CourseRestController {

    @Autowired
    CourseService courseService;


    @PostMapping
    public DeferredResult<ResponseEntity<BaseResponse<CourseEntity>>> createCourse(
            @RequestBody CourseEntity courseEntity
    ) {
        DeferredResult<ResponseEntity<BaseResponse<CourseEntity>>> result = new DeferredResult<>();
        courseService.createCourse(courseEntity).subscribeOn(Schedulers.io())
                .subscribe(
                        res -> result.setResult(ResponseEntity.ok(res)),
                        ex -> result.setErrorResult(ex)
                );
        return result;
    }

    @PostMapping("/search")
    public DeferredResult<ResponseEntity<BaseResponse<Page<CourseEntity>>>> searchCourses(
            @RequestBody SearchCourseCriteria courseCriteria
    ) {
        DeferredResult<ResponseEntity<BaseResponse<Page<CourseEntity>>>> result = new DeferredResult<>();
        courseService.searchCourses(courseCriteria).subscribeOn(Schedulers.io())
                .subscribe(
                        res -> result.setResult(ResponseEntity.ok(res)),
                        ex -> result.setErrorResult(ex)
                );
        return result;
    }



    @GetMapping("/categories")
    public DeferredResult<ResponseEntity<BaseResponse<List<CourseCategoryEntity>>>> getCourseCategories() {
        DeferredResult<ResponseEntity<BaseResponse<List<CourseCategoryEntity>>>> result = new DeferredResult<>();
        courseService.getCourseCategories().subscribeOn(Schedulers.io())
                .subscribe(
                        res -> result.setResult(ResponseEntity.ok(res)),
                        ex -> result.setErrorResult(ex)
                );
        return result;
    }

}
