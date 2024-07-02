package com.cmr.dev.feedbackforum.business.config;
  
import org.modelmapper.ModelMapper;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@EnableJpaAuditing
@EntityScan("com.cmr.dev.feedbackforum.business.entity")
@EnableJpaRepositories("com.cmr.dev.feedbackforum.business.*") 
@ComponentScan( 
		basePackages ={"com.cmr.dev.feedbackforum.business.*"})
																 
public class FeedbackforumBusinessConfig {
	  @Bean(value = "Feedbackforum-modelmapper")
	  @Scope(value = "singleton")
	  public ModelMapper modelMapper() {
	    ModelMapper modelMapper = new ModelMapper();
	    return modelMapper;
	  }

	
}