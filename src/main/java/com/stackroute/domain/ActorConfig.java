package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
public class ActorConfig {

    @Bean(value = "Movie A, Movie B", initMethod = "initMethod")
    @Scope(scopeName = "prototype")
    public com.stackroute.domain.Movie movie() {
        return new com.stackroute.domain.Movie(new ArrayList<Actor>());
    }

    @Bean
    public Actor actor() {
        return new Actor();
    }
}