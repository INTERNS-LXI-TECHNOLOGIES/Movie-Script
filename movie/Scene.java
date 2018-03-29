package com.lxisoft.moviescript.movie;
import java.io.*;
import com.sun.media.sound.*;
import java.util.*;
public class Scene
{
  private ArrayList<String> dialogues = new ArrayList<String>();
 
   public void createDialogues(ArrayList<String> dialogues)
   {
	 this.dialogues = dialogues;
   }
   public ArrayList<String> getDialogues()
   {
     return dialogues;
   }	 
 
}