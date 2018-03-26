package com.lxisoft.moviescript.movie;
import com.lxisoft.moviescript.crew.Actor;
import com.lxisoft.moviescript.crew.Director;
import com.lxisoft.moviescript.crew.ScriptWriter;
import com.lxisoft.moviescript.movie.Script;
import com.lxisoft.moviescript.movie.Scene;
import java.util.ArrayList;
public class Movie{
	
	private String name;
	private Director director;
	private ScriptWriter scriptWriter;
	private ArrayList<Actor> actors=new ArrayList<Actor>();
	
	
	
	public void movieLaunch(){
		
		System.out.println("===================================================================");
		System.out.println("||                 	MOVIE SCRIPT                             ||");
		System.out.println("===================================================================");
		System.out.println("MOVIE NAME		: "+getName());
		System.out.println("DIRECTOR NAME	        : "+director.getDirector());
		System.out.println("SCRIPT WRITER NAME	: "+scriptWriter.getScriptWriter());
		System.out.println("ACTOR NAME   "  +  "                 CHARACTER NAME ");
		actors.new Actor();
		actors.setActorName("DILEEP");
		actors.setCharacterName("UNNI KRISHNAN");
	}
	public void initialization(){
		
		director=new Director("RAFI MECARTIN");
		scriptWriter=new ScriptWriter("SREENIVASAN");
		//actors.new Actor();
		movieLaunch();
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