package com.poc.zuul.consul.consulgateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ConsulgatewayApplication {


	@Autowired
	ConsulConfig config;

	public static void main(String[] args) {
		SpringApplication.run(ConsulgatewayApplication.class, args);
	}


	public String getProperties()

	{

		return  config.getProperties();
	}

}
