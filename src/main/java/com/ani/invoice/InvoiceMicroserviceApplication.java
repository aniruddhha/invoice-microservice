package com.ani.invoice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class InvoiceMicroserviceApplication {
	public static void main(String[] args) {
		SpringApplication.run(InvoiceMicroserviceApplication.class, args);
	}
}
