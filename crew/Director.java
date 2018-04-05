package com.lxisoft.moviescript.crew;
import com.lxisoft.moviescript.crew.Actor;
import java.util.Scanner;
import java.util.ArrayList;
public class Director{
	
	private String name;
	Scanner scan=new Scanner(System.in);

	public Director(String name){
		
		setDirector(name);
		
	}
	public void setDirector(String name){
		 
		this.name=name;
	}
	
	public String getDirector(){
		
		return name;
	}
	
	
	public ArrayList<Actor> casting(){
		
		ArrayList<Actor> actors=new ArrayList<Actor>();
		int ch=0;
		int i=1;
		do{
	
			actors.add(new Actor());
			System.out.println("ENTER THE ACTOR NAME "+i);
			actors.get(actors.size()-1).setActorName(scan.next());
			System.out.println("ENTER THE ACTOR'S CHARACTER NAME "+i);
			actors.get(actors.size()-1).setCharacterName(scan.next());
			i++;
			System.out.println("CASTING AS(CHOOSE CHARACTER TYPE) 1.HERO/2.HEROINE/3.COMEDIAN/4.VILLAN");
			int charType=scan.nextInt();
			switch(charType)
			{
			case 1:
			actors.get(actors.size()-1).setCharacterType(CharacterType.HERO);
			break;
			case 2:
			actors.get(actors.size()-1).setCharacterType(CharacterType.HEROINE);
			break;
			case 3:
			actors.get(actors.size()-1).setCharacterType(CharacterType.COMEDIAN);
			break;
			case 4:
			actors.get(actors.size()-1).setCharacterType(CharacterType.VILLAN);
			break;
			}
			System.out.println("DO YOU WANT TO ADD ACTOR 1.YES/0.NO");
			ch=scan.nextInt();
		}while(ch==1);
	
		return actors;
	}



}	