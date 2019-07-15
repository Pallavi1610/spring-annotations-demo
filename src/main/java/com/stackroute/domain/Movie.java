package com.stackroute.domain;

/*
Displays actor information for respective movies.
 */

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    @Autowired
    private Actor actor;

    public Movie() {

    }

    @Autowired
    public Movie(Actor actor) {
        this.actor = actor;
        System.out.println("Constructor Called");
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
        System.out.println("Setter Method Called");
    }

    public void displayInformation() {
        actor.display();
    }

    public void initMethod() {
        actor = new Actor("Pallavi", "Female", 20);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Called");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name : " + s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application Context Set");
    }
}
