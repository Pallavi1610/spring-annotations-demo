package com.stackroute.domain;

/*
Displays actor information for respective movies.
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jmx.export.annotation.ManagedResource;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class Movie {

    @Autowired
    private List<Actor> actor;

    public Movie(List<Actor> actor) {
        this.actor = actor;
    }

    public List<Actor> getActor() {
        return actor;
    }

    public void setActor(List<Actor> actor) {
        this.actor = actor;
    }

    public void displayInformation() {
        for(Actor actor: actor) {
            actor.display();
        }
    }

    public void initMethod() {
        actor = Arrays.asList(new Actor("Pallavi", "Female", 20), new Actor("Meghana", "Female", 20), new Actor("Mrudula", "Female", 25));
    }
}