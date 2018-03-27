package com.lxisoft.moviescript.crew;
import com.java.util.Scanner;
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

	public void setScript(ArrayList<Actor> actor){
		
		//ArrayList <ArrayList<Animal>> animals=new ArrayList<ArrayList<Animal>>();
		ArrayList<ArrayList <Scene>> dialogues=new ArrayList<ArrayList<Scene>>();
		//ArrayList <Animal> tigers=new ArrayList <Animal>();
		
		System.out.println("enter the number of scenes :");
		int noOfScenes=scan.nextInt();
		
	
		
		
		
		
		
		
		
		
	}
	
	
}