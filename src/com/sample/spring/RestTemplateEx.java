package com.sample.spring;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestTemplateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     RestTemplate template1= new RestTemplate();
    Login l= template1.getForObject("http://localhost:8080/SampleSpring/Rest/getUser", Login.class);
	System.out.println(l.getUserName());
	 
	RestTemplate template2= new RestTemplate();
	 HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	ResponseEntity<Login> entity1= template2.exchange("http://localhost:8080/SampleSpring/Rest/getEntity", HttpMethod.POST, entity, Login.class,l);
	System.out.println(entity1.getStatusCode());
	}

}
