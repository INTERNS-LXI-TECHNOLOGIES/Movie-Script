package com.lxisoft.moviescript.crew;
import com.lxisoft.moviescript.movie.Script;
import com.lxisoft.moviescript.movie.Scene;
import java.util.ArrayList;
import java.util.Scanner;
public class ScriptWriter{
	
	private String name;
    Scanner scan=new Scanner(System.in); 	
	public Script script;
	
	public ScriptWriter(String name){
		
		setScriptWriter(name);
		
		
	}
	public void setScriptWriter(String name){
		
		this.name=name;
	}
	
	public String getScriptWriter(){
		
		return name;
	} 

	
	public void writeScript(ArrayList<Actor> actors){
		
		script=new Script();
		script.settingScenes();
		
	}
	/*public void screenPlay(){
		
		
		String[] addedDialogues=new String[10];
		addedDialogues=script.getScenes().sendDialogues();
		System.out.println("%%%%%%%%%%%%%%"+addedDialogues);
	}*/

}