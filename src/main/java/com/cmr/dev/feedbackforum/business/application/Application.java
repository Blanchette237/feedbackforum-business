package com.cmr.dev.feedbackforum.business.application;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cmr.dev.feedbackforum.business")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}