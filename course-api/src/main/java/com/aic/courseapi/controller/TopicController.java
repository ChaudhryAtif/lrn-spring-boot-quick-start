package com.aic.courseapi.controller;

import com.aic.courseapi.domain.Topic;
import com.aic.courseapi.service.TopicService;
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
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping(value = "/topics", method = GET, produces = APPLICATION_JSON_VALUE)
    public List<Topic> getAll() {
        return topicService.getAll();
    }

    @RequestMapping(value = "/topics/{id}", method = GET, produces = APPLICATION_JSON_VALUE)
    public Topic getOne(@PathVariable Long id) {
        return topicService.getOne(id);
    }

    @RequestMapping(value = "/topics", method = POST, produces = APPLICATION_JSON_VALUE)
    public void add(@RequestBody Topic topic) {
        topicService.add(topic);
    }

    @RequestMapping(value = "/topics", method = PUT, produces = APPLICATION_JSON_VALUE)
    public void update(@RequestBody Topic topic) {
        topicService.update(topic);
    }

    @RequestMapping(value = "/topics/{id}", method = DELETE)
    public void delete(@PathVariable("id") Long id) {
        topicService.delete(id);
    }

}
