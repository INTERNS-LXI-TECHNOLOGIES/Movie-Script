package com.lxisoft.moviescriptUsingFile.model;

/**
* The Actor class contains:
*	a) instance variable: realName, characterName, role
*	b) constructor: Actor()), Actor(String characterName, String role)
*	c) method: getCharacterName, setCharacterName(), getRealName(), setRealName(), getRole(), setRole(). toString()
*
* @author  Vyshnav Ramesh
* @version 1.0
* @since   05*04-2018 
*/
public class Actor{

	private String realName, characterName, role;
	
	//Constructors
	public Actor(){}
	public Actor(String characterName, String role){
		this.characterName = characterName;
		this.role = role;
	}
	
	//Getters And Setters
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getCharacterName() {
		return characterName;
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	//To String
	@Override
	public String toString(){
		return role+": "+realName+" ("+characterName+")";		
	}
}