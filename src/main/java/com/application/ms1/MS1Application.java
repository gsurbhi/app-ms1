package com.application.ms1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@EnableDiscoveryClient    // for auto registration of service with consul
@SpringBootApplication
public class MS1Application {

	public static void main(String[] args) {
		SpringApplication.run(MS1Application.class, args);
	}
}
