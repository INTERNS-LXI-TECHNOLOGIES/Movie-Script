package com.lxisoft.moviescript.movie;
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