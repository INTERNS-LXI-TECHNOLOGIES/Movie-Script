package com.lxisoft.moviescript.model;

public class Actor{

	private String realName, characterName, role;
	
	public Actor(){}
	
	public Actor(String characterName, String role){
		this.characterName = characterName;
		this.role = role;
	}
	
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