package com.latteyan.demo.ms.members;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsMemberApplication.class, args);
	}

}
