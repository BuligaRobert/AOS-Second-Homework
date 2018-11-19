package com.aos.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.aos*"})
@EntityScan("com.aos*")
@EnableJpaRepositories("com.aos.second.*")
public class ComposeApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ComposeApplication.class, args);
	
	}
}
