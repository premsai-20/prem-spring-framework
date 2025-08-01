package com.premsai.learn_spring_framework.example.a1;

import java.util.Arrays;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass{
	
	Dependency1 dependency1; //fields	
	Dependency2 dependency2;
	
	//@Autowired // in constructor inj, autowired is not needed!!!!
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		//this is constructor injection
		System.out.println("dep wired"); 
		this.dependency1 = dependency1;
		
		this.dependency2 = dependency2;
	}
	
	
	
//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		//this is setter injection
//		this.dependency1 = dependency1;
//	}
//
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		this.dependency2 = dependency2;
//	}
//
//	public String toString() {
//		return "Using" + dependency1 + " and " + dependency2;
//	}
}

@Component
class Dependency1{
	
}

@Component
class Dependency2{
	
}

@Configuration
@ComponentScan
			
public class DepInjectionLauncherApplication {
	
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(DepInjectionLauncherApplication.class)) {
		
			Arrays.stream(context.getBeanDefinitionNames())
				  .forEach(System.out::println);
			
			System.out.println(context.getBean(YourBusinessClass.class));
		}
		
	}

}
