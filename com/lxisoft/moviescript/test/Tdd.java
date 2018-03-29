package com.lxisoft.moviescript.test;
import com.lxisoft.moviescript.controller.MovieController;

/* 	cd notepad-workspace\LXI\Movie-Script

	javac com\lxisoft\moviescript\test\Tdd.java

	java com.lxisoft.moviescript.test.Tdd */

public class Tdd {
	
	public static void main(String[] args){
		
		MovieController movieController = new MovieController();
		
		movieController.createDirector();
		movieController.createScriptWriter();
		movieController.createDialogueBook();
		movieController.setCharacters();
		movieController.createScript();
		movieController.assignActors();
		movieController.createMovie();
		movieController.displayMovieDetails();
		movieController.displayScript();
	}
}