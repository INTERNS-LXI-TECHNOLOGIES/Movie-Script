package com.lxisoft.moviescript.crew;
import java.util.ArrayList;
import java.util.Scanner;
import com.lxisoft.moviescript.crew.Actor;
import com.lxisoft.moviescript.crew.Character;
public class Director{
Scanner scan=new Scanner(System.in);
private String name;
public Director(String name){
		setName(name);
	}
//#####################################
public void setName(String name){
		this.name=name;
	}
//#####################################
public String getName()
	{
		return name;
	}
public ArrayList<Actor> casting(ArrayList<Character>characters){

		ArrayList<Actor>actors=new ArrayList<Actor>();
		
		for(Character tempCharacter:characters)	{
		
			System.out.println("[] Enter the actor name for "+tempCharacter.getName());
			Actor actor=new Actor();
			actor.setName(scan.next());
			actor.setCharacter(tempCharacter);
			actors.add(actor);
		
		}
		return actors;
	}

}