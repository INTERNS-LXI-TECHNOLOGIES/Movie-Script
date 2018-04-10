package com.lxisoft.moviescriptUsingFile.controller;
import com.lxisoft.moviescriptUsingFile.model.*;
import java.util.List;

/**
* The DirectorController class: 
*	a) assigns Movie name, 
*	b) assigns Actors 
*
* @author  Vyshnav Ramesh
* @version 1.0
* @since   05*04-2018 
*/
public class DirectorController{
	
	//Assign Movie Name
	public void assignMovieName(Movie movie, String name){
		movie.setName(name);
	}
	
	//Assign Actors
	public void assignActors(List<Actor> actorList){
		for (Actor actor : actorList){
			if(actor.getCharacterName()=="Bond"){
				actor.setRealName("Shiv");
			}else if(actor.getCharacterName()=="Queen"){
				actor.setRealName("Jeny");
			}else if(actor.getCharacterName()=="Hulk"){
				actor.setRealName("Hilfiger");
			}else if(actor.getCharacterName()=="Lol"){
				actor.setRealName("Jagathy");
			}
		}
	}
}