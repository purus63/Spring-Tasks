package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;


public class Main
{
    public static void main( String[] args )
    {
        //XMLBean Factory
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("bean.xml"));
        Movie m1= factory.getBean("mov",Movie.class);
        m1.display();

        //Application Context
        ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
        Movie m2= context.getBean("mov",Movie.class);
        m2.display();

        //BeanDefinitionRegistry
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        BeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(new FileSystemResource("/home/cgi/Desktop/Spring/task1/src/main/resources/bean.xml"));
        Movie m3 = beanFactory.getBean("mov",Movie.class);
        m3.display();

    }
}
