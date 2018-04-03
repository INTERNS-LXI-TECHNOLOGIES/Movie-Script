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
  
  
  
      public void  createScenes(ArrayList<String> dialogueBook,Hero[] hero,Villain[] villains,Heroin[] heroins)
        {
           do
			{	
			    scenes.add(new Scene());
			  for(int i = 0;i < 3 ;i++)
			  {
			    scenes.get(scenes.size()-1).getDialogues().add(dialogueBook.get((int)Math.random()*dialogueBook.size()));
			  }
			 //scenes.add(new Scene());
			 }while(scenes.size()<=3);
			 //for(int j=0;j<2;j++)
			 //{
				 int j = 0;
			//do
			//{	
               // for(int k = 0;k<3;k++)
				//{					
			        
					hero[0].deliveringScenes(scenes.get(j).getDialogues().get(0));
					//Villain[j].deliveringScenes(scenes.)
				//}
			 //}
         }

}