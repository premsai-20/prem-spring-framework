package com.premsai.learn_spring_framework.game;

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
