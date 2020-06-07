package com.example.demo.topic;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

     private List <Topic> topics =new ArrayList<>(Arrays.asList(
            new Topic("1","Dheeraj","Velury"),
            new Topic("2","XXXXX","test1"),
            new Topic("3","YYYYY","test2")

     ));
     public List<Topic> getAllTopics()
     {
         return topics;
    }

    public Topic getTopic(String id)
    {
       return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
         topics.add(topic);
    }
}


