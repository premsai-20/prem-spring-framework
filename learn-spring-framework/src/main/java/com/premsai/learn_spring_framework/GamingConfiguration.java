package com.premsai.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.premsai.learn_spring_framework.game.GameRunner;
import com.premsai.learn_spring_framework.game.GamingConsole;
import com.premsai.learn_spring_framework.game.PacmanGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();
		return game;
	}
	
//	//var game = new MarioGame();
//	//var game= new SuperContraGame();
//	var game = new PacmanGame(); // #1 Object is created 
//	
//	var gameRunner = new GameRunner(game); 
//	// #2 Object is created + wiring of dependencies
//	// game is a dependent of GameRunner
	
	//gameRunner.run();
}
