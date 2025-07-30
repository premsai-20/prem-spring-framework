package com.premsai.learn_spring_framework.helloworld;

//import java.lang.reflect.Array;
//import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		
		//1. Launch a Spring Context/application
		
		try(var context = 
				new AnnotationConfigApplicationContext 
				(HelloWorldConfiguration.class)){
			
			//2. Configure the things that we want Spring to manage - @Configuration
			
			//3. we can retrieve beans by using context.getBean("bean_name")
			System.out.println(context.getBean("name"));

			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			
			System.out.println(context.getBean("person2MethodCall"));

			System.out.println(context.getBean("person3Parameters"));
			
			System.out.println(context.getBean("address2"));
			
			System.out.println(context.getBean(Address.class));
			
			System.out.println(context.getBean(Person.class));
			
			System.out.println(context.getBean("person5Parameters"));
			
			//we can use name of the bean or type of the bean to retrieve it
			
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

		}
	
	}

}
