package com.stackroute;

import com.stackroute.demo.AppConfig;
import com.stackroute.demo.BeanLifecycleDemoBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Application
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        ((AnnotationConfigApplicationContext) context).registerShutdownHook();
        BeanLifecycleDemoBean beanLifeCycleDemo=(BeanLifecycleDemoBean) context.getBean("beanLifeCycle");
    }
}