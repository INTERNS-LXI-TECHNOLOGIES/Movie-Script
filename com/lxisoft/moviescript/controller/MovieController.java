package com.lxisoft.moviescript.controller;
import com.lxisoft.moviescript.model.*
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class MovieController {
		
	private DialogueBook dialogueBook;
	private Director director;
	List<Actor> actorList;
	Script script;
	public static final String MOVIE_NAME = "NARASIMHAM";
	Movie movie;
	ScriptWriterController scriptWriterController;
	

	//Create Director
	public void createDirector(){
		director = new Director("Sathyan Anthikaad");
	}
	
	//Create Script-Writer
	public void createScriptWriter(){
		scriptWriter = new ScriptWriter("Sreenivasan");
	}
	
	//Set Character NamespaceAlias
	public void setCharacterNames(){
		
	}
	
	//Create Dialog-Book	
	public void createDialogueBook(){
		dialogueBook = new DialogueBook({"comedyDialogue1","comedyDialogue2"},
									{"romanticDialogue1","romanticDialogue2"},
									{"heroicDialogue1","heroicDialogue2"},
									{"villainousDialogue1","villainousDialogue2"});
	}
	
	//Set Character Names and Roles
	public void setCharacters(){
		actorList = new ArrayList<Actor>();
		
		Actor actor1 = new Actor("A","hero");
		Actor actor2 = new Actor("B","heroine");
		Actor actor3 = new Actor("C","villain");
		Actor actor4 = new Actor("D","comedian");
		
		actorList.add(actor1);
		actorList.add(actor2);
		actorList.add(actor3);
		actorList.add(actor4);	
	}
	
	//Create Script
	public void createScript(){
		script = new Script();
		scriptWriterController.writeScript(script);
	}
	
	//Assign Actors
	public void assignActors(){
		directorController.assignActors(actorList);
	}
	
	//Create Movie
	public void createMovie(){
		movie = new Movie(director, scriptWriter, actorList, script);
		directorController.assignMovieName(movie,MOVIE_NAME);
	}	
	
	pulic void displayScript(){
		script = movie.getScript();
		List<Scene> sceneList =  script.getSceneList();
		for(Scene scene : sceneList){
			System.out.println(scene.getNumber());
			System.out.println(scene.getType());
			for(Action action : scene.getActionList()){
				System.out.println(action);
			}
		}
	}
	
}