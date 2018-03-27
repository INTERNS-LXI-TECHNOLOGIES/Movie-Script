package com.lxisoft.moviescript.movie;
import com.lxisoft.moviescript.movie.Scene;
import java.util.ArrayList;
public class Script{
	private String name;
	private String directorName;
	ArrayList<Scene> scenes=new ArrayList<Scene>();
	
	public void setDirectorName(String directorName){
		this.directorName=directorName;
	}
	public String getDirectorName(){
		return directorName;
	}
	public void addScenes(){
		scenes.add(new Scene());
	}
/*	public Scene getScenes(){
		return scenes;
	}*/
	
	
		
	
}