package com.lxisoft.moviescriptUsingFile.model;
import java.util.List;

/**
* The Script class contains:
*	a) instance variable: sceneList
*	b) method: getSceneList(), setSceneList()
*
* @author  Vyshnav Ramesh
* @version 1.0
* @since   05*04-2018 
*/
public class Script{

	private List<Scene> sceneList;
	
	//Getters and Setters
	public List<Scene> getSceneList()	{
		return sceneList;
	}
	public void setSceneList(List<Scene> sceneList) {
		this.sceneList = sceneList;
	}

}