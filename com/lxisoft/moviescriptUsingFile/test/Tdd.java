package com.lxisoft.moviescriptUsingFile.test;
import com.lxisoft.moviescriptUsingFile.controller.MovieController;

/* 	cd notepad-workspace\LXI\Movie-Script

	javac com\lxisoft\moviescriptUsingFile\test\Tdd.java

	java com.lxisoft.moviescriptUsingFile.test.Tdd

	Changes to be made: FileUtilsClass, next/nextInt/nextLine, constant value names for random numbers
	->	next(): reads till space(ie, returns a token), cursor positions itself at the end of the word
	->	nextInt(): reads int only(space allowed after int, but returns int part only), cursor positions itself at the end of the number (if space also inputted after number, then also cursor positions just after number and before space)
	->	nextLine(): reads the remaining characters from the current cursor position upto the beginning of next line, cursor positions itself at the beginning of next line
	
	*/
	
/**
* The Tdd class creates MovieController class and calls functions inside it
*
* @author  Vyshnav Ramesh
* @version 1.0
* @since   05*04-2018 
*/

public class Tdd {
	
	public static void main(String[] args){
		
		MovieController movieController = new MovieController();
		
		movieController.createDirector();
		movieController.createScriptWriter();
		movieController.createFile();
/* 		movieController.createDialogueBook();
		movieController.setCharacters();
		movieController.createScript();
		movieController.assignActors();
		movieController.createMovie();
		movieController.displayMovieDetails();
		movieController.displayScript(); */
	}
}