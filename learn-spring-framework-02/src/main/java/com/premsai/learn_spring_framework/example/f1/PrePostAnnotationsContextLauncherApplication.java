package com.premsai.learn_spring_framework.example.f1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	
	private SomeDependency someDependency;
	public SomeClass(SomeDependency someDependency) {
		super();
		
		this.someDependency=someDependency;
		System.out.println("all dependencies are ready");
	}
	
	@PostConstruct
	public void intialize() {
		someDependency.getReady();
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("Cleaned up database");
	}
	
}

@Component
class SomeDependency{

	public String getReady() {
		System.out.println("Some logic using SomeDependency");
		return "fang yuan";
		
	}
	
}

@Configuration
@ComponentScan
			
public class PrePostAnnotationsContextLauncherApplication {
	
	
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(PrePostAnnotationsContextLauncherApplication.class)) {
			
			
			Arrays.stream(context.getBeanDefinitionNames())
				  .forEach(System.out::println);
			System.out.println(context.getBean(SomeDependency.class).getReady());
		}
		
	}

}
