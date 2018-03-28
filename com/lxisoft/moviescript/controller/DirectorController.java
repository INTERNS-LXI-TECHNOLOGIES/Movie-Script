package com.lxisoft.moviescript.controller;
import com.lxisoft.moviescript.model.*
import java.util.List;

public class DirectorController{
	
	//Assign Movie Name
	public void assignMovieName(Movie movie, String name){
		movie.setName(name);
	}
	
	//Assign Actors
	public void assignActors(List<Actor> actorList){
		for (Actor actor : actorList){
			if(actor.getCharacrterName()=="A"){actor.setRealName("Shiv")}
			else if(actor.getCharacrterName()=="B"){actor.setRealName("Jeny")}
			else if(actor.getCharacrterName()=="C"){actor.setRealName("Hilfiger")}
			else if(actor.getCharacrterName()=="D"){actor.setRealName("Lol")}
		}
	}
}