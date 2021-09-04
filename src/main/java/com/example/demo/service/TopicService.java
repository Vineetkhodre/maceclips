package com.example.demo.service;


import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.TopicRepository;
import com.example.demo.topics.Topic;

@Service
public class TopicService {
	

   @Autowired
   private TopicRepository topicrepository;
   Topic t3;
			
	   
	
	public List <Topic> getAllTopics()
	{
		ArrayList <Topic> topics=new ArrayList<Topic>();
		topicrepository.findAll().forEach(topics::add);
		return topics;
		

	}
	

	public Optional<Topic> getTopic(String id) 
	{
		
		return topicrepository.findById(id);
		
		
	}


	public void addTopic(Topic topic) {
		topicrepository.save(topic);
		
	}


	public void upDateTopic(String id, Topic topic) {
	
	   topicrepository.save(topic);
	}


	public void deleteTopic(String id)
	{
		 topicrepository.deleteById(id);
		
	}

}
