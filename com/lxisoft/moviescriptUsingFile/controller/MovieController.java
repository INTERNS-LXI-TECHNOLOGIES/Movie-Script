package com.lxisoft.moviescript.controller;
import com.lxisoft.moviescript.model.*;
import java.util.List;
import java.util.ArrayList;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

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
	
	//Create Dialogue-Book	
	public void createDialogueBook(){
		dialogueBook = new DialogueBook();
		Path pathComedy = FileSystems.getDefault().getPath("D:\\notepad-workspace\\LXI\\Movie-Script\\com\\lxisoft\\moviescriptUsingFile\\file", "comedy.txt");
		List<String> lines = Files.readAllLines(path, Charset.forName("UTF-8"));
		String[] arr = lines.toArray(new String[lines.size()]);
		dialogueBook.setComicArray(arr);
		
		pathComedy = FileSystems.getDefault().getPath("D:\\notepad-workspace\\LXI\\Movie-Script\\com\\lxisoft\\moviescriptUsingFile\\file", "romantic.txt");
		List<String> lines = Files.readAllLines(path, Charset.forName("UTF-8"));
		String[] arr = lines.toArray(new String[lines.size()]);
		dialogueBook.setRomanticArray(arr);
		
		pathComedy = FileSystems.getDefault().getPath("D:\\notepad-workspace\\LXI\\Movie-Script\\com\\lxisoft\\moviescriptUsingFile\\file", "villainous.txt");
		List<String> lines = Files.readAllLines(path, Charset.forName("UTF-8"));
		String[] arr = lines.toArray(new String[lines.size()]);
		dialogueBook.setHeroicArray(arr);
		
		pathComedy = FileSystems.getDefault().getPath("D:\\notepad-workspace\\LXI\\Movie-Script\\com\\lxisoft\\moviescriptUsingFile\\file", "heroic.txt");
		List<String> lines = Files.readAllLines(path, Charset.forName("UTF-8"));
		String[] arr = lines.toArray(new String[lines.size()]);
		dialogueBook.setVillainousArray(arr);
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