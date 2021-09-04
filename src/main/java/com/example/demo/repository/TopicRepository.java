package com.example.demo.repository;



import org.springframework.data.repository.CrudRepository;

import com.example.demo.topics.Topic;

public interface TopicRepository  extends CrudRepository<Topic,String>{
	

}
