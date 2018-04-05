package com.lxisoft.moviescript.crew;
import java.util.ArrayList;
import java.util.Scanner;
public class Director{
	private String name;
	Scanner scan=new Scanner(System.in);
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public Director(String name){
		setName(name);
		
	}
	
	public ArrayList<Actor> casting(){
		ArrayList<Actor>actors=new ArrayList<Actor>();
		int x=0;
		do{
			actors.add(new Actor());
			System.out.println("enter the name of the actor");
			actors.get(actors.size()-1).setActorName(scan.next());
			System.out.println("enter the name of the character");
			actors.get(actors.size()-1).setCharacterName(scan.next());
			
			System.out.println("choose character Type \n 1.hero \n 2.heroine \n 3.villian \n 4.comedian ");			
			int charType=scan.nextInt();
			
			switch(charType){
				case 1:
					actors.get(actors.size()-1).setCharacterType(CharacterType.HERO);
				break;
				case 2:
					actors.get(actors.size()-1).setCharacterType(CharacterType.HEROINE);
				break;
				case 3:
					actors.get(actors.size()-1).setCharacterType(CharacterType.VILLAIN);
				break;
				case 4:
					actors.get(actors.size()-1).setCharacterType(CharacterType.COMEDIAN);
				break;
			
			}
			
			System.out.println("do you want to add new actor");
			x=scan.nextInt();
			
			
			}while(x==1);
		
		return actors;
	}
	
}