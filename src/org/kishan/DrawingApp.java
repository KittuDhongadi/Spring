package org.kishan;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
	public static void main(String args[])
	{
		 /* Normal object creation
		 Triangle triangle=new Triangle();
		 triangle.draw();
		 */
		 
		 //     with bean factory
		 /*BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		 Triangle triangle=( Triangle)factory.getBean("triangle");
		 */
		 
		 //with Application context
		
		/*
		//Upto 13th video
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle=(Triangle) context.getBean("triangle1");
		triangle.draw();
		*/
		
		
		/*
		//14th video
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Triangle triangle=(Triangle) context.getBean("triangle");
		triangle.draw();
		*/
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		Triangle triangle=(Triangle) context.getBean("triangle");
		triangle.draw();
	}

}
