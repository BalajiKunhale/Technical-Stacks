package com.BikkadIT.RestTempalteClientApp.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceImpl implements ServiceI {

	@Override
	public void getData() {
		
		String url = " https://api.nationalize.io/?name=nathaniel";
		//String url = "http://localhost:9090/getAllStu ";
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> forEntity = rt.getForEntity(url, String.class );
		String body = forEntity.getBody();
		System.out.println(body);
		
		
	}

	@Override
	public void getDataASync() {
		// TODO Auto-generated method stub
		
	}
	
	

}
