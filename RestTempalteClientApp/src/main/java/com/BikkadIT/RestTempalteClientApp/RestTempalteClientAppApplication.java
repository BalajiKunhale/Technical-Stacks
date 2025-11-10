package com.BikkadIT.RestTempalteClientApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.RestTempalteClientApp.service.ServiceI;

@SpringBootApplication
public class RestTempalteClientAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext contxt = SpringApplication.run(RestTempalteClientAppApplication.class, args);
		ServiceI bean = contxt.getBean(ServiceI.class);
		bean.getData();
		
		
	}

}
