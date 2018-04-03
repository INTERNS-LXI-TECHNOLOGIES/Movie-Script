package com.lxisoft.moviescript.crew;
import java.util.ArrayList;
import com.lxisoft.moviescript.crew.Character;
import com.lxisoft.moviescript.crew.Actor;
public class Actor{
private String name;
private Character character;
public void setName(String name){
	
		this.name=name;
		
	}
public String  getName(){
	
	 return name;
		
	}
public void setCharacter(Character character){
	
		this.character=character;
		
	}
	public Character getCharacter(){
	
		return character;
		
	}
}