package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args )
    {

          BeanFactory factory = new XmlBeanFactory(new ClassPathResource("bean.xml"));
        Movie m1= factory.getBean("mov",Movie.class);
        m1.display();



        ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
        Movie m= context.getBean("mov",Movie.class);
        m.display();




    }
}
