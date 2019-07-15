package com.stackroute.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ActorConfig {

    @Bean(value = {"firstMovie"}, initMethod = "initMethod")
    public Movie movie() {
        return new Movie();
    }

    @Bean(value = {"secondMovie"}, initMethod = "initMethod")
    public Movie getMovie() {
        return new Movie(new Actor());
    }

    @Bean
    public Actor getActor() {
        return new Actor();
    }
}