package com.lxisoft.movescript.script;
import com.lxisoft.moviescript.script.Scene;
import java.util.ArrayList;
public class Script{
	private String name;
	private String directorName;
	ArrayList<Scene> scenes=new ArrayList<Scene>();
	
	public void setDirectorName(String directorName){
		this.directorName=directorName;
	}
	public String getDirectorName();{
		return directorName;
	}
	public void addScenes(){
		scenes.add(new Scene());
	}
/*	public Scene getScenes(){
		return scenes;
	}*/
	
	
		
	
}