package io.dc.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import io.dc.models.Course;

public interface CourseRepository extends Neo4jRepository<Course, Long> {

} 
