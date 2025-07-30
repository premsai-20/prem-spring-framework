package com.premsai.learn_spring_framework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//record- general when making a class we have to 
//make setter, getter constructor, etc.
//using record we can skip those, they are made automatically
//this was introduced in JDK16

record Person(String name, int age, Address address) { };

record Address(String firstLine, String city) { };

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Prem Sai";
	}
	@Bean
	public int age() {
		return 21;
	}
	
	@Bean 
	@Primary
	public Person person() {
		return new Person("Fang Yuan", 500, new Address("Qing Mountain","Southern Border"));
		//person.age(); we can use the getter methods also
		
	}
	
	@Bean 
	public Person person2MethodCall() {
		return new Person(name(), age(), address()); 
		//making new bean using existing bean by calling the methods.	
	}
	
	@Bean // these parameters are bean names only
	public Person person3Parameters(String name, int age, Address address3) {
		//use bean names- name,age,address2
		return new Person(name, age, address3); 
	}
	
	@Bean // these parameters are bean names only
	public Person person4Parameters(String name, int age, Address address) {
		return new Person(name, age, address); 
	}
	
	@Bean // these parameters are bean names only
	public Person person5Parameters(String name, int age, @Qualifier("address3qualifier") Address address) {
		return new Person(name, age, address); 
	}
	
	
	@Bean(name="address2") //bean names can be customized like this!
	@Primary
	public Address address() {
		return new Address("Qing Mountain", "Southern Border");
		//person.age(); we can use the getter methods also
	}
	
	@Bean(name="address3") //bean names can be customized like this!
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("Dang Hua Mountain", "Central Contient");
	}
	
	
	
}
