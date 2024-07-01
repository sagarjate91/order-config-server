package com.training.order_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class OrderConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderConfigServerApplication.class, args);
	}

}
