package com.lxisoft.moviescript.movie;
import java.util.*;
import com.sun.media.sound.*;
public class ScreenPlay
{
 	private ArrayList<Scene> scenes = new ArrayList<Scene>();
	
	
   public void setScenes(ArrayList<Scene> scenes)
   {
	  this.scenes = scenes;
   }
   public ArrayList<Scene> getScenes()
   {
	  return scenes;
   }
  
  
  
      public void  createScenes(ArrayList<String> dialogueBook,Hero hero)
        {
           do
			{	
			  for(int i = 0;i < 3 ;i++)
			  {
			    scenes.add(new Scene());
			    scenes.get(scenes.size()-1).getDialogues().add(dialogueBook.get((int)Math.random()*dialogueBook.size()));
			  }
			 //scenes.add(new Scene());
			 }while(scenes.size()<=3);
			  hero.deliveringScenes(scenes);
         }

}