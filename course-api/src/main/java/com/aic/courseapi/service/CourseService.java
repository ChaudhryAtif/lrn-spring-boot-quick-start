package com.aic.courseapi.service;

import com.aic.courseapi.domain.Course;
import com.aic.courseapi.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllByTopicId(Long topicId) {
        return courseRepository.findByTopicId(topicId);
    }

    public Course getOne(Long id) {
        return courseRepository.findOne(id);
    }

    public void add(Course course) {
        courseRepository.save(course);
    }

    public void update(Course course) {
        courseRepository.save(course);
    }

    public void delete(Long id) {
        courseRepository.delete(id);
    }
}
