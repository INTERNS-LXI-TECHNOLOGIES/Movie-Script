package com.lxisoft.moviescriptUsingFile.model;

/**
* The Director class contains:
*	a) instance variable: name
*	b) constructor: Director(String name)
*	c) method: getName(), setName()
*
* @author  Vyshnav Ramesh
* @version 1.0
* @since   05*04-2018 
*/
public class Director{
	
	private String name;
	
	//Constructor
	public Director(String name){
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
