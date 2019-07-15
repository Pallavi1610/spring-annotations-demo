package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;

/*
Actor Model Class
 */
public class Actor {

    //@Value("${actor.name}")
    private String name;

    //@Value("${actor.gender}")
    private String gender;

    //@Value("${actor.age}")
    private int age;

    public Actor() {

    }

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("Name:"+name+"\n"+"Gender:"+gender+"\n"+"Age:"+age+"\n");
    }
}
