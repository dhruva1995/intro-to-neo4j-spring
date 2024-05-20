package io.dc.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.dc.models.Course;
import io.dc.service.CourseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/v1/courses")
@Log4j2
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @GetMapping(value="/", produces = "application/json")    
    public ResponseEntity<List<Course>> listCourses() {
        log.info("Listing all courses");
        return ResponseEntity.ok(courseService.listCourses());
    }
}
