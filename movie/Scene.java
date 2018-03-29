package com.lxisoft.moviescript.movie;
import java.util.ArrayList;
public class Scene{
	
	private int number;
	String[] dialogues=new String[10];
	
	public void setNumber(int number){
		
		this.number=number;
		
	}
	public int getNumber(){
		
		return number;
		
	}
	
	public void setDialogues(){
		
		  dialogues[0]="mothalali...janga jaga jaga";
		  dialogues[1]="ath avarkariyalo Daddy kum Mummy kum";
		  dialogues[2]="ella Masavum undallo 1 nam thiyathi";
		  dialogues[3]="enikk samsarikan mathram evide arum ellathayille";
		  dialogues[4]="are soniyya----!!soniyya poratte...";
		  dialogues[5]="njan entha kuppinn vanna bhoothuo";
		  dialogues[6]="vegam theerthal!! udane adutha pani tharam";
		  dialogues[7]="chor.... chorr....";
		  dialogues[8]="ghana ghana.. ahh ne poy ghana kazhikikko";
		  dialogues[9]="hmmm military ahh military illatha vedi ochakkyokke kelkum";
		  dialogueDisplay(dialogues);
		
	}
	
	public void dialogueDisplay(String[] dialogues){
		
		int x = (int) (Math.random() * 10);
		for(int i=0;i<x;i++){
			int y = (int) (Math.random() * 10);
			System.out.println(""+dialogues[y]);
		
		}
	}
	
	public String[] sendDialogues(){
		return dialogues;
	}
	
	
	  
	
	

}