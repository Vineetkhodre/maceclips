package com.example.demo.controller;


import static org.mockito.Mockito.verify;

import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.repository.TopicRepository;
import com.example.demo.service.TopicService;
@WebMvcTest
class HelloControllerTest {
	
	@Autowired
	MockMvc mock;
	

	@MockBean
	TopicRepository topicrepository;
	@MockBean
	TopicService ts;

	@Test
	void test() {
		Mockito.when(ts.getAllTopics()).thenReturn(Collections.emptyList());
		try {
			MvcResult mvcr = mock.perform(MockMvcRequestBuilders.get("/topics").accept(MediaType.APPLICATION_JSON)).andReturn();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		verify(ts).getAllTopics();
	}

}
