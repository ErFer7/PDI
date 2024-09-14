package com.ufscplanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DatabaseApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(DatabaseApplication.class);
		ConfigurableApplicationContext context = app.run(args);

		context.close();
	}

}
