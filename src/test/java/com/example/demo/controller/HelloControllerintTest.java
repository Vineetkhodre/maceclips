package com.example.demo.controller;



import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.CurdOperationh2Application;

@SpringBootTest(classes= CurdOperationh2Application.class)
@AutoConfigureMockMvc
@TestPropertySource(locations="classpath:application.properties")
class HelloControllerintTest {

		@Autowired
		MockMvc mock;
		

		@Test
		void test() throws Exception {
			
		
				MvcResult mvcr = mock.perform(MockMvcRequestBuilders.get("/topics")
						.accept(MediaType.APPLICATION_JSON)).andReturn();
			
		
		}
	

}
