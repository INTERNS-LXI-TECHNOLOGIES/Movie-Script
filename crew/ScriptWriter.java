package com.lxisoft.moviescript.crew;
import com.lxisoft.moviescript.movie.Script;
import com.lxisoft.moviescript.movie.Scene;
import com.lxisoft.moviescript.movie.Dialogue;
import java.util.ArrayList;
import java.util.Scanner;
public class ScriptWriter{
	
	private String name;
    Scanner scan=new Scanner(); 	
	Script script=new Script();
	
	public ScriptWriter(String name){
		
		setScriptWriter(name);
		
	}
	public void setScriptWriter(String name){
		
		this.name=name;
	}
	
	public String getScriptWriter(){
		
		return name;
	}
	
	public void writeScript(ArrayList<Actor> actors){
		
		//ArrayList<ArrayList <Scene>>dialogues=new ArrayList<ArrayList <Scene>>();	
		System.out.println("-----------------*******************-----------------");
		System.out.println("ENTER NUMBER OF SCENES: ");
		int noOfScenes=scan.nextInt();
		for(int i=1;i<=noOfScenes;i++){
			System.out.println("---SCENE "+i+"---"); 
			
		}
		
	}

}