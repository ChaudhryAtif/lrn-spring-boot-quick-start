package com.aic.courseapi.controller;

import com.aic.courseapi.domain.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api")
public class TopicController {

    @RequestMapping(value = "/topics", method = GET, produces = APPLICATION_JSON_VALUE)
    public List<Topic> getAll() {
        return Arrays.asList(
                new Topic(1L, "Spring Framework", "Spring Framework Description"),
                new Topic(2L, "Core Java", "Core Java Description"),
                new Topic(3L, "JavaScript", "JavaScript Description")
        );
    }

}
