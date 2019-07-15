package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("file:src/actorInformation.properties")
public class ActorConfig {

    @Bean
    public Movie movie() {
        return new Movie();
    }

    @Bean
    public Actor actor() {
        return new Actor();
    }
}
