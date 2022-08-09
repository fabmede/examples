package com.ftm.springgcp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {
		"com.ftm.springgcp.person"
})
@EnableJpaRepositories(basePackages = {
		"com.ftm.springgcp.person"
})
@SpringBootApplication
public class SpringGcpExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGcpExampleApplication.class, args);
	}

}
