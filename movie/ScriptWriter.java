package com.lxisoft.moviescript.movie;
import java.util.*;
import java.io.*;
import com.sun.media.sound.*;
public class ScriptWriter
{
	private String scriptWriterName;
	private ScreenPlay screenPlay;
	private ArrayList<JavaSoundAudioClip> dialogueBook = new ArrayList<JavaSoundAudioClip>();
	
	 public void setScriptWriterName(String scriptWriterName)
	  {
		this.scriptWriterName = scriptWriterName; 
	  }
	  public String getScriptWriterName()
	   {
		 return scriptWriterName;  
	   }
	  public void setScreenPlay(ScreenPlay screenPlay)
	   {
		 this.screenPlay = screenPlay;  
	   }	  
	  public ScreenPlay getScreenPlay()
	   {
		return screenPlay;  
	   }	  
	  public void setDialogueBook(ArrayList<JavaSoundAudioClip> dialogueBook)
	  {
		  this.dialogueBook = dialogueBook;
	  }
	  public ArrayList<JavaSoundAudioClip> getDialogueBook()
	  {
		  return dialogueBook;
	  }
	 
	  public ScriptWriter()
	  {
		  try
		  {
		  //JavaSoundAudioClip scene1=new JavaSoundAudioClip(new FileInputStream(new File("E:/workspace/com/lxisoft/moviescript/Ravanaprabhu_Malayalam_Movie_Dialogue_Scene_By_Mohanlal_Napoleon_Malayalam_Hit_Movies.wav")));
		  dialogueBook.add(new JavaSoundAudioClip(new FileInputStream(new File("E:/workspace/com/lxisoft/moviescript/sounds/Ravanaprabhu_Malayalam_Movie_Dialogue_Scene_By_Mohanlal_Napoleon_Malayalam_Hit_Movies.wav"))));
		  
		  dialogueBook.add(new JavaSoundAudioClip(new FileInputStream(new File("E:/workspace/com/lxisoft/moviescript/sounds/Ravanaprabhu_Malayalam_Movie_Dialogue_Scene_By_Mohanlal_Napoleon_Malayalam_Hit_Movies2.wav"))));
		  dialogueBook.add(new JavaSoundAudioClip(new FileInputStream(new File("E:/workspace/com/lxisoft/moviescript/sounds/Ravanaprabhu_Malayalam_Movie_Diagloue_Scene_Mohanlal_Vijayaraghavan_Malayalam_Dialogues_HD3.wav"))));
		  }catch(Exception e){System.out.print("...");}
		  
		  /*dialogueBook.add("Savari giri giri.........");
		  dialogueBook.add("Aappachattiyil ari varukkalle");
		  dialogueBook.add("Nadesa kollanda");
		  dialogueBook.add("Kalikkam Tannolam Ponnavarod Allachal Purath Mannu Pattum");
		  dialogueBook.add("Vazhi Mareda Mundakkal Sekhara");
		  dialogueBook.add("Eda Challu Chekka Mulappalu Kiniyunundoda Nakkilu");
		  dialogueBook.add("Otta Kayyil Double Barrel Pokki Aim Cheyunna Neramonnum Enikk Venda Njan Ingane Poorathinte Sample Vedikett Nadathunna Pole Ee Aaradi Onnara Inchil Savari Giri Giri Nadathum");
		  dialogueBook.add("Poyanalukalude Chudaalaparmbinte Pazchediyayi Njn Matram Baaki Ennado Maranamennod Daya Kanikkunth");
		  dialogueBook.add("Eswaran Ninte munnil Vilakkay Teliyumpol Athinte Nerkk Thupparuth");*/
	  }
      public void createScript(Hero[] hero,Villain[] villains,Heroin[] heroins)
	  {
		  setScreenPlay(new ScreenPlay());

		  //System.out.print(dialogueBook.get(1));
		  screenPlay.createScenes(dialogueBook,hero,villains,heroins);
		  
	  }


}