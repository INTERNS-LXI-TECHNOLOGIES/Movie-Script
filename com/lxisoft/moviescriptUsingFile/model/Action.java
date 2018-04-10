package com.lxisoft.moviescriptUsingFile.model;


/**
* The Action class contains:
*	a) instance variable: characterName and dialogue
*	b) method: getCharacterName(), setCharacterName(), getDialogue(), setDialogue(), toString()
*
* @author  Vyshnav Ramesh
* @version 1.0
* @since   05*04-2018 
*/
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