package com.lxisoft.moviescript.crew;
import java.util.ArrayList; 
import com.lxisoft.moviescript.movie.*;
public class Character{
private String name;
private CharacterType characterType;
private ArrayList<Scene>scenes=new ArrayList<Scene>();
public void  setCharacterType(CharacterType characterType)
	{
		
		this.characterType=characterType;
		
	}
	
public CharacterType  getCharacterType(){
	
		
		return characterType;
		
	}
public Character(String name){
		
	setName(name);

	}
public void setName(String name){
	
		this.name=name;
	}
public String getName(){
	
		return name;
	
	} 
}