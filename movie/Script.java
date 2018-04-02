package com.lxisoft.moviescript.movie;
import com.lxisoft.moviescript.movie.Scene;
import com.lxisoft.moviescript.crew.Actor;
import java.util.Scanner;
import java.util.ArrayList;
public class Script{
	
	private String directorName;
	ArrayList<Scene> scenes=new ArrayList<Scene>();
	Scanner scan=new Scanner(System.in);
	
	
	public void setScenes(ArrayList<Actor> actors){
		int x=0;
		do{
		System.out.println(" adding new scenes");	
		scenes.add(new Scene());
		scenes.get(scenes.size()-1).setSceneNumber(scenes.size());
		System.out.println(" added scene "+scenes.get(scenes.size()-1).getSceneNumber());
		
		System.out.println("do you want to add new scene press 1");
		x=scan.nextInt();
		}while(x==1);
		
		for(int j=0;j<scenes.size();j++){
			System.out.println("\n");
			System.out.println("adding dialogues to Scene "+(j+1));
			scenes.get(scenes.size()-1).setDialogue(actors);
		}
	}
	
}