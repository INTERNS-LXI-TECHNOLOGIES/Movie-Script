package com.lxisoft.moviescriptUsingFile.controller;
import com.lxisoft.moviescriptUsingFile.model.*;
import java.util.List;
import java.util.ArrayList;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.*;

public class MovieController {
		
	private DialogueBook dialogueBook;
	private Director director;
	private ScriptWriter scriptWriter;
	private List<Actor> actorList;
	private Script script;
	public static final String MOVIE_NAME = "Jumanji";
	private Movie movie;
	private DirectorController directorController;
	

	//Create Director
	public void createDirector(){
		director = new Director("Sathyan Anthikad");
	}
	
	//Create Script-Writer
	public void createScriptWriter(){
		scriptWriter = new ScriptWriter("Sreenivasan");
	}
	
	//Create Dialogue-Book	
	public void createDialogueBook(){
		dialogueBook = new DialogueBook();
		try{
		FileReader fr = new FileReader("D:\\notepad-workspace\\LXI\\Movie-Script\\com\\lxisoft\\moviescriptUsingFile\\file\\dialogue.txt");
		BufferedReader br = new BufferedReader(fr); // make a Reader
		String s;
		String[] words;
		while( (s = br.readLine()) != null) {	// read data
			words = s.split("\\s+");
			
			/* TO REMOVE PUNCTUATIONS: (NOT NEEDED HERE)
			for (int i = 0; i < words.length; i++) {
				words[i] = words[i].replaceAll("[^\\w]", ""); 
				 
					To replace everything that is not word character, use negated character class:
						.replaceAll("[^\\w]", "");
					or
						.replaceAll("\\W", "");
					Both of them will replace the characters apart from [a-zA-Z0-9_]. If you want to replace the underscore too, then use:
						[\\W_]	
			}
			*/
			
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
		br.close();
		} catch(IOException e){}
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