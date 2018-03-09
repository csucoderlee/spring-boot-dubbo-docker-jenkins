package org.csu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,})
public class CommonUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonUserApplication.class, args);
	}
}
