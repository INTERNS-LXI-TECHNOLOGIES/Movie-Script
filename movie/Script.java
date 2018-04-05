package com.lxisoft.moviescript.movie;
import com.lxisoft.moviescript.movie.Scene;
import com.lxisoft.moviescript.crew.Actor;
import java.util.ArrayList;
import java.util.Scanner;
public class Script{
	
	private ArrayList<Scene> scenes=new ArrayList<Scene>();
	Scanner scan=new Scanner(System.in);
	
	
	
	public void setScene(Scene scene){
		
		scenes.add(scene);
	}
	public ArrayList<Scene> getScene(){
		
		return scenes;
	}
		
	public void displayScenes(){
		for(Scene tempScene:scenes){
			tempScene.displayScene();
		}
	}
	
	
}