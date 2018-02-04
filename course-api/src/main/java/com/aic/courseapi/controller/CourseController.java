package com.aic.courseapi.controller;

import com.aic.courseapi.domain.Course;
import com.aic.courseapi.domain.Topic;
import com.aic.courseapi.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/api")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/topics/{topicId}/courses", method = GET, produces = APPLICATION_JSON_VALUE)
    public List<Course> getAllCoursesByTopicId(@PathVariable Long topicId) {
        return courseService.getAllCoursesByTopicId(topicId);
    }

    @RequestMapping(value = "/topics/{topicId}/courses/{id}", method = GET, produces = APPLICATION_JSON_VALUE)
    public Course getOne(@PathVariable Long id, @PathVariable Long topicId) {
        return courseService.getOne(id);
    }

    @RequestMapping(value = "/topics/{topicId}/courses", method = POST, produces = APPLICATION_JSON_VALUE)
    public void add(@RequestBody Course course, @PathVariable Long topicId) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.add(course);
    }

    @RequestMapping(value = "/topics/{topicId}/courses", method = PUT, produces = APPLICATION_JSON_VALUE)
    public void update(@RequestBody Course course, @PathVariable Long topicId) {
        course.setTopic(new Topic(topicId, "", ""));
        courseService.update(course);
    }

    @RequestMapping(value = "/topics/{topicId}/courses/{id}", method = DELETE)
    public void delete(@PathVariable("id") Long id, @PathVariable Long topicId) {
        courseService.delete(id);
    }

}
