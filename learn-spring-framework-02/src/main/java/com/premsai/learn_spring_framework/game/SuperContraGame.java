package com.premsai.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole{
	
	public void up() {
		System.out.println("Fly");
	}
	
	public void down() {
		System.out.println("Bend Over!");
	}
	
	public void left() {
		System.out.println("Fall Back");
	}
	
	public void right() {
		System.out.println("Accelerate");
	}
}
