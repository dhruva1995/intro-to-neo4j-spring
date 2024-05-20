package io.dc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import io.dc.models.Course;
import io.dc.repositories.CourseRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository courseRepository;

    // List all courses
    public List<Course> listCourses() {
        return courseRepository.findAll();
    }
}
