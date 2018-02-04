package com.aic.courseapi.service;

import com.aic.courseapi.domain.Topic;
import com.aic.courseapi.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAll() {
        return topicRepository.findAll();
    }

    public Topic getOne(Long id) {
        return topicRepository.findOne(id);
    }

    public void add(Topic topic) {
        topicRepository.save(topic);
    }

    public void update(Topic topic) {
        topicRepository.save(topic);
    }

    public void delete(Long id) {
        topicRepository.delete(id);
    }
}
