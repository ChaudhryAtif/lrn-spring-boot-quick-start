package com.aic.courseapi.repository;

import com.aic.courseapi.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {



}
