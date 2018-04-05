package com.lxisoft.moviescript.movie;
import java.util.ArrayList;
import com.lxisoft.moviescript.movie.Dialogue;
import com.lxisoft.moviescript.crew.Character;
public class Scene
{
	private int number;
	private ArrayList<Dialogue>dialogues=new ArrayList<Dialogue>();
	private ArrayList<Character>characterSequance=new ArrayList<Character>();
	
	public void setNumber(int number){
	
		this.number=number;
	
	}
	
	public int getNumber(){
	
		return number;
	
	}
	
	public void setDialogues(ArrayList<Dialogue>dialogues){
	
		this.dialogues=dialogues;
	
	}
	
	public void setCharacterSequance(ArrayList<Character>characterSequance){
		
		this.characterSequance=characterSequance;
		
	}
	
	public ArrayList<Dialogue> getDialogues(){
	
		return dialogues;
		
	}
	
	public ArrayList<Character> getCharacterSequance(){
	
		return characterSequance;
		
	}
	public void displayScene()
	{
		System.out.println("\n"+"       [] Scene:"+number);
		
		for(int i=0;i<dialogues.size();i++){
		
			System.out.println(characterSequance.get(i).getName()+" :"+dialogues.get(i).getDialogue());
			
		}
	}	
}
	