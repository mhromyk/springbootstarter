package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<> (Arrays.asList(new Topic("spring","Spring framework", "Spring framework description")
            ,new Topic("Java","Java CORE", "Java CORE description")
            ,new Topic("OCA","OCA certificate", "OCA certificate description")
            ));
 
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
			
	public void  addTopic(Topic topic) {
		topics.add(topic);
	}
}
