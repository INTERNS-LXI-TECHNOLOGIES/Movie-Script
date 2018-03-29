package com.lxisoft.moviescript.model;

public class Action{

	private String characterName, dialogue;

	//Getters and Setters
	public String getCharacterName() {
		return characterName; 
	}
	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	public String getDialogue() {
		return dialogue;
	}
	public void setDialogue(String dialogue) {
		this.dialogue = dialogue;
	}

	//To String
	@Override
	public String toString(){
		return " 	"+characterName+":	"+dialogue;		
	}

}