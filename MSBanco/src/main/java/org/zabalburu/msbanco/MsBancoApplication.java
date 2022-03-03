package org.zabalburu.msbanco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsBancoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsBancoApplication.class, args);
	}

}
