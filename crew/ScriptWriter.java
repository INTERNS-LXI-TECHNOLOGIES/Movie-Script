package com.lxisoft.moviescript.crew;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileInputStream;
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
			Scene scene=writeScene(characters);
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
		
			System.out.print("["+(i+1)+"] character name :");
			Character tempCharacter=new Character(scan.next());
			characters.add(tempCharacter);
			System.out.println(" 1)Hero"+"\n"+" 2)Villan"+"\n"+" 3)Comedian"+"\n"+" 4)Heroin");
			switch(scan.nextInt()){
				case 1:tempCharacter.setCharacterType(CharacterType.HERO);
						break;
				case 2:tempCharacter.setCharacterType(CharacterType.VILLAN);
						break;
				case 3:tempCharacter.setCharacterType(CharacterType.COMEDIAN);
						break;
				case 4:tempCharacter.setCharacterType(CharacterType.HEROIN);
						break;
				default:tempCharacter.setCharacterType(CharacterType.COMEDIAN);
						break;
			}
		
		
		}
		return characters;
	}
	public Scene writeScene(ArrayList<Character>tempCharacters){
		Scene scene=new Scene();
		ArrayList<Character>characters=tempCharacters;
		ArrayList<Dialogue>dialogues=new ArrayList<Dialogue>();
		ArrayList<Character>characterSequance=new ArrayList<Character>();
		int noOfDialogues=(int) ((Math.random()*8)+4);
		for(int i=0;i<noOfDialogues;i++){
		  
			int indxNo=(int) (Math.random()*characters.size());
			Dialogue tempDialogue;
			if(characterSequance.isEmpty()){	
				characterSequance.add(characters.get(indxNo));
				tempDialogue=new Dialogue(i+1);
					CharacterType dialogueType=characters.get(indxNo).getCharacterType();
					tempDialogue.setDialogue(dialogueGenerator(dialogueType));
				dialogues.add(tempDialogue);
				}
				else
				{
					
					do{
	                
						indxNo=(int) (Math.random()*characters.size());                                       
						tempDialogue=new Dialogue(i+1);	
						CharacterType dialogueType=characters.get(indxNo).getCharacterType();
						tempDialogue.setDialogue(dialogueGenerator(dialogueType));
					}while(characters.get(indxNo)==characterSequance.get(characterSequance.size()-1) );
						characterSequance.add(characters.get(indxNo));
						dialogues.add(tempDialogue);
				}
			}
			scene.setDialogues(dialogues);
			scene.setCharacterSequance(characterSequance);
			return scene;
		}
	public String  dialogueGenerator(CharacterType dialogueType){
		String file;
		String dialogue;
		switch(dialogueType){
				case HERO:file="E:/0001-workspace/com/lxisoft/moviescript/dialogues/HERO.txt";
						break;
				case VILLAN:file="E:/0001-workspace/com/lxisoft/moviescript/dialogues/VILLAN.txt";
						break;
				case COMEDIAN:file="E:/0001-workspace/com/lxisoft/moviescript/dialogues/COMEDIAN.txt";
						break;
				case HEROIN:file="E:/0001-workspace/com/lxisoft/moviescript/dialogues/HEROIN.txt";
						break;
				default:file="E:/0001-workspace/com/lxisoft/moviescript/dialogues/COMEDIAN.txt";
						break;
						
			}
		dialogue="koiiii";
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream(file)));
			int dialogueNo=(int) (Math.random()*4);
			
			loop:
			for(int i=0;i<4;i++)
			{
				dialogue=br.readLine();
				if(i==dialogueNo)
				{
					break loop;
				}
				
			}
			
		}
		catch(IOException e)
		{
			System.out.println("ERROR: unable to read file " + file);
			e.printStackTrace();  
			
		}
		//String [] dialogues={"d1","d2","d3","d4","d5","d6"};
		//return dialogues[((int)(Math.random()*6))];
		return dialogue;
	}
}