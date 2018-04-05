package com.lxisoft.moviescript.crew;
import com.lxisoft.moviescript.movie.Script;
import com.lxisoft.moviescript.movie.Scene;
import com.lxisoft.moviescript.crew.Actor;
import com.lxisoft.moviescript.crew.CharacterType;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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

	//public void setScript(ArrayList<Actor> actor){
		public Script writeScript(ArrayList<Actor> actors){
			Script script=new Script();	
			int x=0;
			do{
				script.setScene(writeScene(actors));
				System.out.println("do you want to add new scene press 1");
				x=scan.nextInt();
				script.getScene().get(script.getScene().size()-1).setSceneNumber(script.getScene().size());
				
			}while(x==1);
			
			return script;
		
		
		
		
		
		/*	ArrayList<ArrayList <Scene>> dialogues=new ArrayList<ArrayList<Scene>>();
		
		
		System.out.println("enter the number of scenes :");
		int noOfScenes=scan.nextInt();
		*/
		
		
		
	}
	
	public  Scene writeScene(ArrayList<Actor> actors){
		
		System.out.println(" adding new scenes");	
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
	
	public String generateDialogue(CharacterType characterType){
		/*String[] dialogues=new String[12];
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
		return dialogues[(int)(Math.random()*10)];*/
		//displayDialogue(dialogues,actors);
		
		String path;
		switch(characterType){
			case COMEDIAN:
				path="F:/000-Workspace/com/lxisoft/moviescript/dialogue/Comedian.txt";
				
			case HERO:
				path="F:/000-Workspace/com/lxisoft/moviescript/dialogue/Heroic.txt";
				
			break;
			case HEROINE:
				path="F:/000-Workspace/com/lxisoft/moviescript/dialogue/Heroinic.txt";
				
			break;
				
			case VILLAIN:
				path="F:/000-Workspace/com/lxisoft/moviescript/dialogue/Villain.txt";
			break;
			default:
				path="F:/000-Workspace/com/lxisoft/moviescript/dialogue/Heroinic.txt";
			break;
		}
			String dialogue=" ";
				try{
					BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(path)));
					int ss=(int) (Math.random()*4);
					loop:
					for(int i=0;i<4;i++){
						dialogue = br.readLine();
						if(ss==i)
						{
							break loop;
						}
						//System.out.println(" file "+dialogue);
					}
				}
				catch(IOException e){
					System.out.println("file doesn't exist");
					e.printStackTrace();
				}				
				
		
		return dialogue;
	}
	
}