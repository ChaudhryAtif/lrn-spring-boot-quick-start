package com.aic.courseapi.repository;

import com.aic.courseapi.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByTopicId(Long topicId);

}
