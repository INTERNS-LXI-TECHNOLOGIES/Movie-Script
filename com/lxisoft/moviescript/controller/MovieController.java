package com.lxisoft.moviescript.controller;
import com.lxisoft.moviescript.model.*;
import java.util.List;
import java.util.ArrayList;

public class MovieController {
		
	private DialogueBook dialogueBook;
	private Director director;
	private ScriptWriter scriptWriter;
	private List<Actor> actorList;
	private Script script;
	public static final String MOVIE_NAME = "NARASIMHAM";
	private Movie movie;
	private DirectorController directorController;
	

	//Create Director
	public void createDirector(){
		director = new Director("Sathyan Anthikaad");
	}
	
	//Create Script-Writer
	public void createScriptWriter(){
		scriptWriter = new ScriptWriter("Sreenivasan");
	}
	
	//Create Dialog-Book	
	public void createDialogueBook(){
		dialogueBook = new DialogueBook(new String[] {"comedyDialogue1","comedyDialogue2","comedyDialogue3","comedyDialogue4"},
										new String[] {"romanticDialogue1","romanticDialogue2","romanticDialogue3","romanticDialogue4"},
										new String[] {"heroicDialogue1","heroicDialogue2","heroicDialogue3","heroicDialogue4"},
										new String[] {"villainousDialogue1","villainousDialogue2","villainousDialogue3","villainousDialogue4"});
	}
	
	//Set Character Names and Roles
	public void setCharacters(){
		actorList = new ArrayList<Actor>();
		
		Actor actor1 = new Actor("Bond","hero");
		Actor actor2 = new Actor("Queen","heroine");
		Actor actor3 = new Actor("Hulk","villain");
		Actor actor4 = new Actor("Lol","comedian");
		
		actorList.add(actor1);
		actorList.add(actor2);
		actorList.add(actor3);
		actorList.add(actor4);	
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