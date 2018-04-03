package com.lxisoft.moviescript.movie;
import java.util.ArrayList;
import java.util.Scanner;
import com.lxisoft.moviescript.crew.*;
import com.lxisoft.moviescript.movie.Script;
public class Movie{
	Scanner scan=new Scanner(System.in);
	private String name;
	private Script script;
	private ArrayList<Actor>actors=new ArrayList<Actor>();
	private Director director;
	private ScriptWriter scriptWriter;
	public void initilization()
	{
		director=new Director("sooraj");
		scriptWriter=new ScriptWriter("Sooraj");
		script=scriptWriter.writeScript();
		actors=director.casting(script.getCharacters());
		name=script.getName();
		showMovie();
	}
	public String getName()
	{
		return name;
	}
	public  Director getDirector()
	{ 
		return director;
	}
	public ScriptWriter getScriptWriter()
	{
		return scriptWriter;
	}
	public void showMovie(){
		
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||"+name+"|||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		for(Actor actor:actors){
			
			System.out.println("             "+actor.getName()+"  as "+actor.getCharacter().getName());
		
		}
		script.displayScript();
	
	}
}