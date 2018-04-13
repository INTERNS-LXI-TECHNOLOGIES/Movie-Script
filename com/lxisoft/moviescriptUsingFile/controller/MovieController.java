package com.lxisoft.moviescriptUsingFile.controller;
import com.lxisoft.moviescriptUsingFile.model.*;
import com.lxisoft.moviescriptUsingFile.util.*;
import java.util.List;
import java.util.ArrayList;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.*;
import java.util.Scanner;

/**
* The MovieController class: 
*	a) creates Director, 
*	b) creates Scriptwriter, 
*	c) creates DialogueBook,
*	d) sets Character Names and Roles,
*	e) creates Script
*	f) assign Actors
*	g) creates Movie
*	h) displays Movie details
*	i) displays Script
*
* @author  Vyshnav Ramesh
* @version 1.0
* @since   05*04-2018 
*/
public class MovieController {
		
	private DialogueBook dialogueBook;
	private Director director;
	private ScriptWriter scriptWriter;
	private List<Actor> actorList;
	private Script script;
	public static final String MOVIE_NAME = "Jumanji";
	private Movie movie;
	private DirectorController directorController;
	Scanner scanner;
	FileUtils fileUtils;
	

	//Create Director
	public void createDirector(){
		director = new Director("Sathyan Anthikad");
	}
	
	//Create Script-Writer
	public void createScriptWriter(){
		scriptWriter = new ScriptWriter("Sreenivasan");
	}
	
	//Create Dialogue File
	public void createFile(){
		scanner = new Scanner(System.in);
		fileUtils = FileUtils.getInstance();
		for(int i =0;i<3;i++){
			writeFile();
		}
	}
	
	//Write To Dialogue File
	private void writeFile(){
		String dialogues ="";
		System.out.println("\n Enter dialogues: ");
		for(int i=0;i<3;i++){
			dialogues+=scanner.nextLine()+" ";
		}
		dialogues+="\n";
		fileUtils.create();
		fileUtils.write(dialogues);
	}
	
	//Create Dialogue-Book	
	public void createDialogueBook(){
		dialogueBook = new DialogueBook();
		String s;
		String[] words;
		try{				
			fileUtils.open();
			while( (s = fileUtils.read()) != null) {	// read data
				words = s.split("\\s+");
				if (s.contains("comedyDialogue1")) {		
					dialogueBook.setComicArray(words);
				} else if (s.contains("romanticDialogue1")) {		
					dialogueBook.setRomanticArray(words);
				} else if (s.contains("heroicDialogue1")) {		
					dialogueBook.setHeroicArray(words);
				} else if (s.contains("villainousDialogue1")) {		
					dialogueBook.setVillainousArray(words);
				}
			}
			fileUtils.close();
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
	//Set Character Names and Roles
	public void setCharacters(){
		actorList = new ArrayList<Actor>();
		
		actorList.add(new Actor("Bond","hero"));
		actorList.add(new Actor("Queen","heroine"));
		actorList.add(new Actor("Hulk","villain"));
		actorList.add(new Actor("Lol","comedian"));	
	}
	
	//Create Script
	public void createScript(){
		script = new Script();
		ScriptWriterController scriptWriterController = new ScriptWriterController();
		scriptWriterController.writeScript(script, actorList, dialogueBook);
	}
	
	//Assign Actors
	public void assignActors(){
		directorController = new DirectorController();
		directorController.assignActors(actorList);
	}
	
	//Create Movie
	public void createMovie(){
		movie = new Movie(director, scriptWriter, actorList, script);
		directorController.assignMovieName(movie,MOVIE_NAME);
	}	
	
	//Display Movie Details
	public void displayMovieDetails(){
		System.out.println("\n\n	MOVIE: "+movie.getName());
		System.out.println("\n 	DIRECTOR: "+movie.getDirector().getName());
		System.out.println("\n	SCRIPTWRITER: "+movie.getScriptWriter().getName());
		for(Actor actor : movie.getActorList()){
			System.out.println("\n	"+actor);
		}
		System.out.println("\n	====================");
	}
	
	//Display Script
	public void displayScript(){
		script = movie.getScript();
		List<Scene> sceneList =  script.getSceneList();
		int sceneNumber;
		for(Scene scene : sceneList){
			sceneNumber = scene.getNumber();
			System.out.print("\n 	Scene No: "+sceneNumber);
			System.out.println(" | Type: "+scene.getType());
			System.out.println("	====================");
			for(Action action : scene.getActionList()){
				System.out.println(action);
			}
		}
	}
	
}