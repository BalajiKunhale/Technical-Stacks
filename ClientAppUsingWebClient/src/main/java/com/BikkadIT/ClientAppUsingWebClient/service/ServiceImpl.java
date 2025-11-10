package com.BikkadIT.ClientAppUsingWebClient.service;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ServiceImpl implements ServiceI{

	@Override
	public void getDataSync() {
		String url = " https://api.nationalize.io/?name=nathaniel";
		//String url = "http://localhost:9090/getAllStu ";
		WebClient webClient = WebClient.create();
		String json = webClient.get().uri(url).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(String.class)
				.block();
		System.out.println(json);

		System.out.println("Welcome To BikkadIT");

	}

	@Override
	public void getDataASync() {
		String url = " https://api.nationalize.io/?name=nathaniel";
		//String url = "http://localhost:9090/getAllStu ";
		WebClient webClient = WebClient.create();
		 webClient.get().uri(url).accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(String.class)
				.subscribe(System.out::println);
		

		System.out.println("Welcome To BikkadIT");

		
	}

}
