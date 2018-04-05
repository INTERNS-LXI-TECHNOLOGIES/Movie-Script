package com.lxisoft.moviescript.movie;
import com.lxisoft.moviescript.crew.Actor;
import com.lxisoft.moviescript.crew.Director;
import com.lxisoft.moviescript.crew.ScriptWriter;
import com.lxisoft.moviescript.movie.Script;
import com.lxisoft.moviescript.movie.Scene;
import java.util.ArrayList;
import java.util.Scanner;
public class Movie{
	
	private String name;
	private Director director;
	private ScriptWriter scriptWriter;
	private Script script;
	private ArrayList<Actor> actors;
	Scanner scan=new Scanner(System.in);
	
	
	public void movieLaunch(){
		
		System.out.println("===================================================================");
		System.out.println("||                 	MOVIE SCRIPT                             ||");
		System.out.println("===================================================================");
		System.out.println("MOVIE NAME		: "+getName());
		System.out.println("DIRECTOR NAME	        : "+director.getDirector());
		System.out.println("SCRIPT WRITER NAME	: "+scriptWriter.getName());
		System.out.println("-------------ACTORS----------------");
		actors=director.casting();                                                                                                               
		displayActors(actors);
		script=scriptWriter.writeScript(actors);
		script.displayScenes();
		
		
	}
	public void initialization(){
		
		director=new Director("RAFI MECARTIN");
		scriptWriter=new ScriptWriter("SREENIVASAN");
		movieLaunch();
	}
	
	public void displayActors(ArrayList<Actor> actors){
		System.out.println("================ACTORS====================");
		System.out.println("ACTOR NAME     "    +  "    CHARACTER NAME" + "CHARACTER TYPE");
		System.out.println("----------     "   +  "    --------------" + "    --------------");
		for(Actor tempActor:actors){
			
			
			System.out.print("  "+tempActor.getActorName());
			System.out.print("                  "+tempActor.getCharacterName());
			System.out.println("                "+tempActor.getCharacterType());
			
		}
		
		
	}
	
	public Movie(String name){
	
		setName(name);
			
	}
	public void setName(String name){
		
		this.name=name;
	}
	
	public String getName(){
		
		return name;
	
	}
	

}