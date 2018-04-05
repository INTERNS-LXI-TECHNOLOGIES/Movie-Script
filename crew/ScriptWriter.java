package com.lxisoft.moviescript.crew;
import com.lxisoft.moviescript.movie.Script;
import com.lxisoft.moviescript.movie.Scene;
import com.lxisoft.moviescript.crew.Actor;
import java.util.Scanner;
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
		
	
		System.out.println("---ADDING NEW SCENE---");	
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
				scene.setDialogues(generateDialogue());
			}
			else
			{
				do
				{
					
					 y=(int)(Math.random()*10);
					 z=(int)(Math.random()*actors.size());
	
				}while(actors.get(z)==characterSequence.get(characterSequence.size()-1));
				characterSequence.add(actors.get(z));
				scene.setDialogues(generateDialogue());
			}
			scene.setCharacterSequence(characterSequence);
			
		}
		return scene;
			
		
	}
	
	public String generateDialogue( ){
		String[] dialogues=new String[12];
		dialogues[0]="mothalalii..... janga jaga jaga";
		dialogues[1]="ath avark ariayalo.... daddykum mummykum";
		dialogues[2]="soniyaaaa.... poratte..";
		dialogues[3]="ella masavum undallo 1am thiyathi";
		dialogues[4]="aarumilleda enik ivde samsarikkan??";
		dialogues[5]="hmmmm.... military ya military... illatha vedi ocha oke kekkum";
		dialogues[6]="njn entha kuppinnu vanna bhoothamo..??";
		dialogues[7]="kaana kazhukanonnum enne kond patla... nahi nnu paranja nahi... podo hey";
		dialogues[8]="chor.... chor";
		dialogues[9]="vegam theerthal adutha pani tharam";
		return dialogues[(int)(Math.random()*10)];
		
		
	}
	
}