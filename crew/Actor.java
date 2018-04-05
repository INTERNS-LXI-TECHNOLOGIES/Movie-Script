package com.lxisoft.moviescript.crew;
import com.lxisoft.moviescript.movie.Movie;
import com.lxisoft.moviescript.crew.CharacterType;
public class Actor{
	
	private String name;
	private String characterName;
	private CharacterType characterType;
	
	
	public void setActorName(String name){
		
		this.name=name;
	}
	
	public String getActorName(){
		
		return name;
	}
	
	public void setCharacterName(String characterName){
		
		this.characterName=characterName;
	}
	public String getCharacterName(){
		
		return characterName;
		
	}
	public void setCharacterType(CharacterType characterType){
		
		this.characterType=characterType;
		
	}
	public CharacterType getCharacterType(){
		
		
		return characterType;
		
	}




}