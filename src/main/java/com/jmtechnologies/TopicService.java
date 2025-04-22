package com.jmtechnologies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TopicService {
@Autowired
private TopicRepository topicRepository;

private List<Topic>topics = Arrays.asList(
new Topic("spring","spring Framework","spring Framework Description"),
new Topic("java","core java","core java Description"),
new Topic("javascript","javascript","javascript Description")
);
public List<Topic> getAllTopics() {
List<Topic>topic = new ArrayList<>();
topicRepository.findAll()
.forEach(topics::add);
return topics;
}
public Topic getTopic(String id){
return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
}
public void updateTopic(String id, Topic topic){
for(int i=0;i<topics.size();i++){
Topic t = topics.get(i);
if(t.getId().equals(id)){
topics.set(i,topic);
return;
}

}
}
public void deleteTopic(String id){
topics.removeIf(t->t.getId().equals(id));
}
}


