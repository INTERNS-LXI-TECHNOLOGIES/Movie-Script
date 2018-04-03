package com.lxisoft.moviescript.crew;
import java.util.ArrayList; 
import com.lxisoft.moviescript.movie.*;
public class Character{
private String name;
private ArrayList<Scene>scenes=new ArrayList<Scene>();
public Character(String name){
		
	setName(name);


	}
public void setName(String name){
	
		this.name=name;
	}
public String getName(){
	
		return name;
	
	}
public void dialogueDelivery(Dialogue dialogue)
	{
		System.out.println(" "+name+" :"+dialogue.getDialogue());
	}
}