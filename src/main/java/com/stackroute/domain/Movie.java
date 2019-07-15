package com.stackroute.domain;

/*
Displays actor information for respective movies.
 */

import org.springframework.beans.factory.annotation.Autowired;

public class Movie {

    @Autowired
    private Actor actor;

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void displayInformation() {
        actor.display();
    }
}