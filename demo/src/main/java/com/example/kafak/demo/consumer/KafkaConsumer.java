package com.example.kafak.demo.consumer;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Component
public class KafkaConsumer {
	
	RestTemplate restTemplate = new RestTemplate();
	
	@KafkaListener(topics = "first_topic", groupId = "group_id")
	public void consume(String message) throws HttpClientErrorException{
		
		System.out.println(message);
		
		String url = "http://localhost:9200/users/employee";
		
		String searchQuery = message;
		
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> requestEntity = new HttpEntity<>(searchQuery, headers);
		ResponseEntity response = null;
		
		try {
			response = restTemplate.postForEntity(url, requestEntity, Object.class);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
