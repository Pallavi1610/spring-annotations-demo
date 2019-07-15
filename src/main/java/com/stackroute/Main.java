package com.stackroute;

import com.stackroute.domain.ActorConfig;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

public class Main
{
    public static void main( String[] args ) {

        //Using BeanFactory
        BeanFactory beanFactory = new AnnotationConfigApplicationContext(ActorConfig.class);
        Movie movie = beanFactory.getBean("movie", Movie.class);
        movie.displayInformation();

        //Using ApplicationContext
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ActorConfig.class);
        movie = applicationContext.getBean("movie", Movie.class);
        movie.displayInformation();
    }
}