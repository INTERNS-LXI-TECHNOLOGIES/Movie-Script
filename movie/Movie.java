package com.lxisoft.moviescript.movie;
import com.lxisoft.moviescript.crew.Director;
import com.lxisoft.moviescript.crew.Actor;
import com.lxisoft.moviescript.crew.ScriptWriter;
import com.lxisoft.moviescript.movie.Script;
import java.util.ArrayList;
import java.util.Scanner;

public class Movie{
	private String name;
	private Director director;
    private ScriptWriter scriptWriter;
	private ArrayList<Actor> actors;
	private Script script;
	
	Scanner scan=new Scanner(System.in);
	
	public Movie(String name){
		
		setName(name);
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
    public void initialization(){
		director=new Director("RAFI MACCARTIN");
		scriptWriter=new ScriptWriter("Sreenivasan");
		
	}
	
	
	public void setMovieScript(){
		System.out.println("====================================================================");
		System.out.println("#                           MOVIE SCRIPT                           #");
		System.out.println("====================================================================");
		System.out.println("movie name           : "+getName());
		System.out.println("Director name        :"+director.getName());
		System.out.println("ScriptWriter name    :"+scriptWriter.getName());
	
		actors=director.casting();
		displayActors(actors);
		script=scriptWriter.writeScript(actors);
		script.displayScenes();
		
	}
	
	
	public void displayActors(ArrayList<Actor> actors){
		System.out.println("Actor name        "+"   charcter name");
		for(Actor tempActor:actors){
			System.out.print(" "+tempActor.getActorName());
			System.out.println("                     "+tempActor.getCharacterName());
			  
		
		}
	}

}