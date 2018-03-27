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
	private Script script=new Script();
	
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
		
		
		
		
		
		
	}
	
	/*public void addActors(){
		int x=0;
		do{
			actors.add(new Actor());
			System.out.println("enter the name of the actor");
			actors.get(actors.size()-1).setActorName(scan.next());
			System.out.println("enter the name of the character");
			actors.get(actors.size()-1).setCharacterName(scan.nextdi());
			System.out.println("do you want to add new actor");
			x=scan.nextInt();
		}while(x==1);
		
		
	}*/
	
	public void displayActors(ArrayList<Actor> actors){
		System.out.println("Actor name        "+"               charcter name");
		for(Actor tempActor:actors){
			System.out.print(" "+tempActor.getActorName());
			System.out.println("                     "+tempActor.getCharacterName());
			  
		
		}
	}
		
	
}