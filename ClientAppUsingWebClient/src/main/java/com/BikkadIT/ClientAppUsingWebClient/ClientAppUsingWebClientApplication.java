package com.BikkadIT.ClientAppUsingWebClient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.RestTempalteClientApp.service.ServiceI;

@SpringBootApplication
public class ClientAppUsingWebClientApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ClientAppUsingWebClientApplication.class, args);
		ServiceI serviceI = context.getBean(ServiceI.class);
		serviceI.getDataASync();
	
	}

}
