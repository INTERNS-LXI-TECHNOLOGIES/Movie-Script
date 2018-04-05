package com.lxisoft.moviescript.movie;
import java.io.*;
import com.sun.media.sound.*;
import java.util.*;
public class Scene
{
  private ArrayList<JavaSoundAudioClip> soundDialogues = new ArrayList<JavaSoundAudioClip>();
  private ArrayList<Dialogue> dialogues = new ArrayList<Dialogue>();
 
   public void setSoundDialogues(ArrayList<JavaSoundAudioClip> dialogues)
   {
	 this.soundDialogues = dialogues;
   }
   public  ArrayList<JavaSoundAudioClip> getSoundDialogues()
   {
     return soundDialogues;
   }

   public  void setDialogues(ArrayList<Dialogue> dialogues)
   {
	   this.dialogues = dialogues;
   }	   
   public ArrayList<Dialogue> getDialogues()
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