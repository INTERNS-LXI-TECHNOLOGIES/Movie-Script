package com.lxisoft.moviescript.movie;
import com.lxisoft.moviescript.crew.Actor;
import java.util.ArrayList;
public class Scene{
	private int number;
	ArrayList<String> Dialogues=new ArrayList<String>();
	ArrayList<Actor>characterSequance=new ArrayList<Actor>();
	
	public void setSceneNumber(int number){
		this.number=number;
	}
	public int getSceneNumber(){
		return number;
	}
	
	public void setDialogues(String Dialogue){
		this.dialogue=dialogue;
	}
	public String getDialogues(){
		return dialogue;
	}
	
	

	public void displayDialogue(String[] dialogues,ArrayList<Actor> actors){
		int x=(int)((Math.random()*10)+1);
		for(int i=0;i<x;i++){
			int y=(int)(Math.random()*10);
			int z=(int)(Math.random()*actors.size());
			System.out.println(actors.get(z).getCharacterName()+" :"+"  "+dialogues[y]);
		}
		
	}
}