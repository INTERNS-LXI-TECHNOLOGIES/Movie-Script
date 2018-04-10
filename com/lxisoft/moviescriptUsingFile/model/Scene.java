package com.lxisoft.moviescriptUsingFile.model;
import java.util.List;

/**
* The Scene class contains:
*	a) instance variable: number, actionList, type
*	b) method: getNumber(), setNumber(), getActionList(), setActionList(), getType(), setType()
*
* @author  Vyshnav Ramesh
* @version 1.0
* @since   05*04-2018 
*/
public class Scene{

	private int number;
	private List<Action> actionList;
	private String type;
	
	//Getters and Setters
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public List<Action> getActionList() {
		return actionList;
	}
	public void setActionList(List<Action> actionList) {
		this.actionList = actionList;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

} 