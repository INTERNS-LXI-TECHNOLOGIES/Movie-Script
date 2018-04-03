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
		public void writeScript(ArrayList<Actor> actors){
		int x=0;
		do{
			script.add(writeScene(actors));
			System.out.println("do you want to add new scene press 1");
			x=scan.nextInt();
			scenes.get(scenes.size()-1).setSceneNumber(scenes.size());
		}while(x==1);
		/*	ArrayList<ArrayList <Scene>> dialogues=new ArrayList<ArrayList<Scene>>();
		
		
		System.out.println("enter the number of scenes :");
		int noOfScenes=scan.nextInt();
		*/
		
		
		
	}
	
	public  Scene writeScene(ArrayList<Actor> actors){
		
	
		System.out.println(" adding new scenes");	
		Scene scene=new Scene();
		ArrayList<Actor>characterSequance=new ArrayList<Actor>();
			System.out.println("\n");
			int x=(int)((Math.random()*10)+4);
			for(int i=0;i<x;i++){
			if(characterSequance.isEmpty())
			{
				int y=(int)(Math.random()*10);
				int z=(int)(Math.random()*actors.size());
				characterSequance.add(actors.get(z));
				scene.setDialogues(generateDialogue());
			}
			else
			{
				do
				{
					
					int y=(int)(Math.random()*10);
					int z=(int)(Math.random()*actors.size());
	
				}while(actors.get(z)==characterSequance.get(characterSequance.size()-1));
				characterSequance.add(actors.get(z));
				scene.setDialogues(generateDialogue());
			}
			scene.seCharacterSequance(characterSequance);
			return scene;
		}
		
			
		
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
		return dialogues[(Math.random()*10)]
		//displayDialogue(dialogues,actors);
		
	}
	
}