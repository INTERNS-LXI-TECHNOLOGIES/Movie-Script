package com.lxisoft.moviescript.movie;
import com.lxisoft.moviescript.crew.Actor;
import java.util.ArrayList;
public class Scene{
	private int number;
	ArrayList<String> dialogue=new ArrayList<String>();
	ArrayList<Actor>characterSequence;
	
	public void setSceneNumber(int number){
		this.number=number;
	}
	public int getSceneNumber(){
		return number;
	}
	
	public void setDialogues(String dialogue){
		this.dialogue.add(dialogue);
	}
	public ArrayList<String> getDialogues(){
		return dialogue;
	}
	public void setCharacterSequence(ArrayList<Actor> characterSequence){
			this.characterSequence=characterSequence;
	
	}
	public void displayScene(){
		System.out.println("\n");
		System.out.println("Scene number :"+number);
		System.out.println("\n");
		for(int i=0;i<characterSequence.size();i++){
			
			System.out.println(characterSequence.get(i).getCharacterName()+" :"+"  "+dialogue.get(i));
		}
		
	}
}