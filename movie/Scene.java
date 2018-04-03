package com.lxisoft.moviescript.movie;
import java.io.*;
import com.sun.media.sound.*;
import java.util.*;
public class Scene
{
  private ArrayList<JavaSoundAudioClip> dialogues = new ArrayList<JavaSoundAudioClip>();
 
   public void createDialogues(ArrayList<JavaSoundAudioClip> dialogues)
   {
	 this.dialogues = dialogues;
   }
   public  ArrayList<JavaSoundAudioClip> getDialogues()
   {
     return dialogues;
   }	 
 
 /*public void setDialogues(String dialogue)
 {
	 dialogues.add(dialogue);
 }	

public String deliveringDialogues()

{
dialogues.get(dialogues.size()-1).setDialogues();
	
}*/	
 
}