package com.lxisoft.moviescript.movie;
import com.lxisoft.moviescript.movie.Scene;
import java.util.ArrayList;
import java.util.Scanner;
public class Script{
	
	private ArrayList<Scene> scenes=new ArrayList<Scene>();
	Scanner scan=new Scanner(System.in);
	
	
	public void settingScenes(){
		
		System.out.println("-----------------*******************-----------------");
		System.out.println("ENTER NUMBER OF SCENES: ");
		int noOfScenes=scan.nextInt();
		for(int i=1;i<=noOfScenes;i++){
			
			//System.out.println("---SCENE "+i+"---"); 
			scenes.add(new Scene());
			scenes.get(scenes.size()-1).setNumber(scenes.size());
			System.out.println("");
			System.out.println("ADD DIALOGUES TO SCENE "+i);
			scenes.get(scenes.size()-1).setDialogues();
		}
		
	}
	public void setScenes(ArrayList<Scene> scenes){
		
		this.scenes=scenes;
	}
	public ArrayList<Scene> getScenes(){
		
		return scenes;
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
}