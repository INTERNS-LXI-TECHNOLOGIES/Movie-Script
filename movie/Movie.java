package com.lxisoft.moviescrit.movie;
import com.lxisoft.moviescript.crew.Director;
import com.lxisoft.moviescript.crew.Actor;
import com.lxisoft.movieScript.crew.ScriptWriter;
import java.util.ArrayList;

public class Movie{
	private String name;
	private Director director;
    private ScriptWriter scriptWriter;
	private ArrayList<Actor> actors=new ArrayList<Actor>();
	private Script script=new Script();
	
	
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
		
		
		
		
		
		
	}
	
}