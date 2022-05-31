package com.nfdeveloper.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

	//Criando um componente a partir de uma chamada de método.
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
