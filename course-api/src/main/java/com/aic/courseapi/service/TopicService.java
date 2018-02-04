package com.aic.courseapi.service;

import com.aic.courseapi.domain.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic(1L, "Spring Framework", "Spring Framework Description"),
            new Topic(2L, "Core Java", "Core Java Description"),
            new Topic(3L, "JavaScript", "JavaScript Description")
    ));

    public List<Topic> getAll() {
        return topics;
    }

    public Topic getOne(Long id) {
        return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public void add(Topic topic) {
        topics.add(topic);
    }

    public void update(Long id, Topic topic) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }

    public void delete(Long id) {
        topics.removeIf(topic -> topic.getId().equals(id));
    }
}
