package com.santhosh.springbootstarter.firstspringboot.topics;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {


    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic(10, "Spring", "IEWL456F"),
            new Topic(11, "Corejava", "ILVD456F"),
            new Topic(12, "DataStructures", "IGCR456F"),
            new Topic(13, "JavaScript", "IHFD456F")
    ));

    public List<Topic> getTopics(){
        return topics;
    }

    public Topic getTopic(String name){
        Optional<Topic> predicate = topics.stream().filter(t -> t.getName().equalsIgnoreCase(name)).findFirst();
        return predicate.get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(String name, Topic topic) {

        for(int i=0;i<topics.size();i++){
            if(topics.get(i).getName().equalsIgnoreCase(name)){
                topics.set(i,topic);
                return;
            }
        }
    }

    public void deleteTopic(String name) {

        topics.removeIf(t -> t.getName().equalsIgnoreCase(name));
    }
}
