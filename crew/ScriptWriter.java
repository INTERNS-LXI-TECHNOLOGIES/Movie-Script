package com.lxisoft.moviescript.crew;
import com.lxisoft.moviescript.movie.Script;
import com.lxisoft.moviescript.movie.Scene;
import com.lxisoft.moviescript.crew.Actor;
import java.util.Scanner;
import java.util.ArrayList;
public class ScriptWriter{

	Scanner scan=new Scanner(System.in);

	private String name;
	Script script=new Script();
	
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public ScriptWriter(String name){
		setName(name);
	}

	//public void setScript(ArrayList<Actor> actor){
		public void setScript(ArrayList<Actor> actors){
		

		script.setScenes(actors);
		/*	ArrayList<ArrayList <Scene>> dialogues=new ArrayList<ArrayList<Scene>>();
		
		
		System.out.println("enter the number of scenes :");
		int noOfScenes=scan.nextInt();
		*/
		
		
		
	}
	
	
}