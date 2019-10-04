package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    /*private static ApplicationContext applicationContext;

    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }*/

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory:: beanFactory::" + beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName:: s::" + s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext:: applicationContext::" + applicationContext);
    }

    private Actor actor;

    public Movie() {
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void display(){
        System.out.println("display:: Name::" + actor.getName());
        System.out.println("display:: Gender::" + actor.getGender());
    }
}
