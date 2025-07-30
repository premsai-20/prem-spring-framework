package com.premsai.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.premsai.learn_spring_framework.game.GameRunner;
import com.premsai.learn_spring_framework.game.GamingConsole;
import com.premsai.learn_spring_framework.game.MarioGame;
import com.premsai.learn_spring_framework.game.PacmanGame;
import com.premsai.learn_spring_framework.game.SuperContraGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext
				(GamingConfiguration.class);
		
		context.getBean(GamingConsole.class).up();
		
//		//var game = new MarioGame();
//		//var game= new SuperContraGame();
//		var game = new PacmanGame(); // #1 Object is created 
//		
//		var gameRunner = new GameRunner(game); 
//		// #2 Object is created + wiring of dependencies
//		// game is a dependent of GameRunner
//		
//		gameRunner.run();
	}

}
