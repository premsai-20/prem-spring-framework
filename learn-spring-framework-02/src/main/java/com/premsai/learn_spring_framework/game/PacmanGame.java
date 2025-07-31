package com.premsai.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class PacmanGame implements GamingConsole {
	
	public void up() {
		System.out.println("Go UP");
	}
	
	public void down() {
		System.out.println("Go DOWN");
	}
	
	public void left() {
		System.out.println("Go LEFT");
	}
	
	public void right() {
		System.out.println("Go RIGHT");
	}
}
