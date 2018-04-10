package com.lxisoft.moviescriptUsingFile.model;

/**
* The ScriptWriter class contains:
*	a) instance variable: name
*	b) constructor: ScriptWriter(String name)
*	c) method: getName(), setName()
*
* @author  Vyshnav Ramesh
* @version 1.0
* @since   05*04-2018 
*/
public class ScriptWriter{
	
	private String name;
	
	//Constructor
	public ScriptWriter(String name){
		this.name = name;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	

}