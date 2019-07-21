package edu.san.mycloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MycloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycloudGatewayApplication.class, args);
	}

}
