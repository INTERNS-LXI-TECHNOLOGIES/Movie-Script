package com.lxisoft.moviescript.crew;
import com.lxisoft.moviescript.movie.Script;
import com.lxisoft.moviescript.movie.Scene;
import com.lxisoft.moviescript.crew.Actor;
import com.lxisoft.moviescript.crew.CharacterType;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
public class ScriptWriter{

	Scanner scan=new Scanner(System.in);

	private String name;
	
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public ScriptWriter(String name){
		setName(name);
	}

	
	public Script writeScript(ArrayList<Actor> actors){
		Script script=new Script();
		int x=0;
		do{
			script.setScene(writeScene(actors));
			System.out.println("DO YOU WANT ADD NEW SCENE PRESS 1");
			x=scan.nextInt();
			script.getScene().get(script.getScene().size()-1).setNumber(script.getScene().size());
		}while(x==1);
		
		
		return script;
	}
	
	public Scene writeScene(ArrayList<Actor> actors){
		
		System.out.println("-------------------------------");
		System.out.println("---ADDING A NEW SCENE---");	
		Scene scene=new Scene();
		ArrayList<Actor>characterSequence=new ArrayList<Actor>();
			System.out.println("\n");
			int x=(int)((Math.random()*10)+4);
			for(int i=0;i<x;i++){
				int y=0;
				int z=0;
			if(characterSequence.isEmpty())
			{
				 y=(int)(Math.random()*10);
				 z=(int)(Math.random()*actors.size());
				characterSequence.add(actors.get(z));
				scene.setDialogues(generateDialogue(actors.get(z).getCharacterType()));
			}
			else
			{
				do
				{
					
					 y=(int)(Math.random()*10);
					 z=(int)(Math.random()*actors.size());
	
				}while(actors.get(z)==characterSequence.get(characterSequence.size()-1));
				characterSequence.add(actors.get(z));
				scene.setDialogues(generateDialogue(actors.get(z).getCharacterType()));
			}
			scene.setCharacterSequence(characterSequence);
			
		}
		return scene;
			
		
	}
	
	public String generateDialogue(CharacterType dialogueType){
		
		String path;
		switch(dialogueType)
		{
			
			case HERO:
				path="F:/workspace/com/lxisoft/moviescript/dialogues/hero.txt";
				break;
			case HEROINE:
				path="F:/workspace/com/lxisoft/moviescript/dialogues/heroine.txt";
				break;
				
			case COMEDIAN:
				path="F:/workspace/com/lxisoft/moviescript/dialogues/comedian.txt";
				break;
			case VILLAN:
				path="F:/workspace/com/lxisoft/moviescript/dialogues/villan.txt";
				break;
			default:
				path="F:/workspace/com/lxisoft/moviescript/dialogues/comedian.txt";
				break;
		}
		String dialogue="  ";
			
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(path)));
		int dialogueNumber=(int)(Math.random()*3);
		loop:
		for(int i=0;i<3;i++){
			dialogue=br.readLine();
			//System.out.println( "File "+dialogue );
			if(dialogueNumber==i){
				
				break loop;
			}
		   
			}
		}
		catch(IOException e)
		{
			System.out.println( "File doesn't exists" );
			e.printStackTrace();
		}
		
		return dialogue;
	}
}