package com.lxisoft.moviescript.movie;
import java.util.ArrayList;
import com.lxisoft.moviescript.movie.Scene;
import com.lxisoft.moviescript.crew.Character;
public class Script
{
	private String name;
	private ArrayList<Character>characters=new ArrayList<Character>();
	private ArrayList<Scene>scenes=new ArrayList<Scene>();
	
	public Script()	
	{	
		name="||  Punjabi House ||";
	}
	
	public void setCharacters(ArrayList<Character> characters){
		
		this.characters=characters;
	
	}
	
	public ArrayList<Character> getCharacters(){
	
		return characters;
	
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setScene(Scene scene){
	
		scenes.add(scene);
	
	}
	
	public ArrayList<Scene> getScene(){
	
		return scenes;
	
	}
	public void displayScript()
	{
		for(Scene scene:scenes){
			
			scene.displayScene();	
			
		}
	}
}
