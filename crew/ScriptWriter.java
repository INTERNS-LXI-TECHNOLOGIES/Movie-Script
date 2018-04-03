package com.lxisoft.moviescript.crew;
import java.util.ArrayList;
import java.util.Scanner;
import com.lxisoft.moviescript.crew.Actor;
import com.lxisoft.moviescript.crew.Character;
import com.lxisoft.moviescript.movie.*;
public class ScriptWriter{
Scanner scan=new Scanner(System.in);
private String name;
private Script script=new Script();
public ScriptWriter(String name){
		this.name=name;

	}
	
	public void setName(){
	
		this.name=name;
		
	}
	
	public String getName(){
	
		return name;
	
	}
//####################################################
	public Script getScript(){
		return script;
	}
//####################################################

	public Script writeScript(){
		
		ArrayList<Character>characters=createCharacters();
		Script script=new Script();
		script.setCharacters(characters);
		System.out.print("[] Enter the no of Scenes:");
		int noOfScenes=scan.nextInt();
		for(int i=0;i<noOfScenes;i++){
			ArrayList<Character>sceneCharacters=new ArrayList<Character>();
			int noOfsceneCharacters=(int)  ((Math.random()*characters.size())+2);
			for(int j=0;j<noOfsceneCharacters;j++)
			{
				int indx=(int)(Math.random()*characters.size());
				sceneCharacters.add(characters.get(indx));
			}
			Scene scene=writeScene(sceneCharacters);
			scene.setNumber(i+1);
			script.setScene(scene);
		}
		return script;
	}
	public ArrayList<Character> createCharacters(){
	
		System.out.print("no of characters:");
		int noOfCharacters=scan.nextInt();
		ArrayList<Character>characters=new ArrayList<Character>();
		for(int i=0;i<noOfCharacters;i++){
		
			System.out.print("["+(i+1)+"] name :");
			characters.add(new Character(scan.next()));
		
		}
		return characters;
	}
	public Scene writeScene(ArrayList<Character>tempCharacters){
		Scene scene=new Scene();
		ArrayList<Character>characters=tempCharacters;
		ArrayList<Dialogue>dialogues=new ArrayList<Dialogue>();
		ArrayList<Character>characterSequance=new ArrayList<Character>();
		int noOfDialogues=(int) ((Math.random()*8)+3);
		for(int i=0;i<noOfDialogues;i++){
		  
			int indxNo=(int) (Math.random()*characters.size());
			Dialogue tempDialogue;
			if(characterSequance.isEmpty()){	
				characterSequance.add(characters.get(indxNo));
				tempDialogue=new Dialogue(i+1);
				tempDialogue.setDialogue(dialogueGenerator());
				dialogues.add(tempDialogue);
				}
				else
				{
					
					do{
	                        
							indxNo=(int) (Math.random()*characters.size();                                       
							tempDialogue=new Dialogue(i+1);	
							tempDialogue.setDialogue(dialogueGenerator());
						
					}while(characters.get(indxNo)==characterSequance.get(characterSequance.size()-1) );
						characterSequance.add(characters.get(indxNo));
						dialogues.add(tempDialogue);
				}
			}
			scene.setDialogues(dialogues);
			scene.setCharacterSequance(characterSequance);
			return scene;
		}
	public String  dialogueGenerator(){
		
		String [] dialogues={"d1","d2","d3","d4","d5","d6"};
		return dialogues[((int)(Math.random()*6))];
	
	}
}