package com.premsai.learn_spring_framework.example.g1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named
class BusninessService{
	private DataService dataService;


	public DataService getDataService() {
		return dataService;
	}
	//@Autowired
	@Inject
	public void setDataService(DataService dataService) {
		System.out.println("Setteer Injection");
		this.dataService = dataService;
	}
}

//@Component
@Named
class DataService{
	
}

@Configuration
@ComponentScan
			
public class CdiContextLauncherApplication {
	
	
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(CdiContextLauncherApplication.class)) {
		
			Arrays.stream(context.getBeanDefinitionNames())
				  .forEach(System.out::println);
			
			System.out.println(context.getBean(BusninessService.class).getDataService());
		}
		
	}

}
