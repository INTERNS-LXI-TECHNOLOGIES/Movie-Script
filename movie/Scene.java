package com.lxisoft.moviescript.movie;
import com.lxisoft.moviescript.crew.Actor;
import java.util.ArrayList;
public class Scene{
	private int number;
	//ArrayList<String> Dialogues=new ArrayList<String>();
	String[] dialogues=new String[12];
	//private Dialogue dialogue=new Dialogue();
	
	public void setSceneNumber(int number){
		this.number=number;
	}
	public int getSceneNumber(){
		return number;
	}
	
	
	public void setDialogue(ArrayList<Actor> actors){
		dialogues[0]="mothalalii..... janga jaga jaga";
		dialogues[1]="ath avark ariayalo.... daddykum mummykum";
		dialogues[2]="soniyaaaa.... poratte..";
		dialogues[3]="ella masavum undallo 1am thiyathi";
		dialogues[4]="aarumilleda enik ivde samsarikkan??";
		dialogues[5]="hmmmm.... military ya military... illatha vedi ocha oke kekkum";
		dialogues[6]="njn entha kuppinnu vanna bhoothamo..??";
		dialogues[7]="kaana kazhukanonnum enne kond patla... nahi nnu paranja nahi... podo hey";
		dialogues[8]="chor.... chor";
		dialogues[9]="vegam theerthal adutha pani tharam";
		displayDialogue(dialogues,actors);
		
	}
	public void displayDialogue(String[] dialogues,ArrayList<Actor> actors){
		int x=(int)((Math.random()*10)+1);
		for(int i=0;i<x;i++){
			int y=(int)(Math.random()*10);
			int z=(int)(Math.random()*actors.size());
			System.out.println(actors.get(z).getCharacterName()+" :"+"  "+dialogues[y]);
		}
		
	}
}