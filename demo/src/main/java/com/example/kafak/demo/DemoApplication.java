package com.example.kafak.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.sql.Date;

import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.common.xcontent.XContentType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;

import com.example.kafak.demo.consumer.KafkaConsumer;
import com.sun.net.httpserver.Authenticator.Result;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemoApplication.class, args);
	}
	
//	@Bean
//	public static void givenJsonString_whenJavaObject_thenIndexDocument() throws IOException {
//		
//		ClientConfiguration clientConfiguration = ClientConfiguration.builder().connectedTo("localhost:9200").build();
//			
//		RestHighLevelClient client = RestClients.create(clientConfiguration).rest();
//		
//		  String jsonObject = "{\"age\":10,\"dateOfBirth\":1471466076564,"
//		    +"\"fullName\":\"John Doe\"}";
//			
//		  IndexRequest request = new IndexRequest("peopl");
//		  request.source(jsonObject, XContentType.JSON);
//		  
//		  IndexResponse response = client.index(request, RequestOptions.DEFAULT);
//		  String index = response.getIndex();
//		  long version = response.getVersion();
//		    
////		  assertEquals(Result.CREATED, response.getResult());
////		  assertEquals(1, version);
////		  assertEquals("people", index);
//		}
	
	

}
