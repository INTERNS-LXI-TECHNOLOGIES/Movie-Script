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
   }[]
  
  
  
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
				// int j = 0;
			
               //for(int k = 0;k<3;k++)
				//{					
			       //for(int l = 0;l<2;l++)
				   //{					   
					hero[0].deliveringScenes(scenes.get(0).getDialogues().get(0);
					villains[0].deliveringScenes(scenes.get(0).getDialogues().get(1));
					heroins[0].deliveringScenes(scenes.get(0).getDialogues().get(2));
					hero[1].deliveringScenes(scenes.get(1).getDialogues().get(3));
					villains[1].deliveringScenes(scenes.get(1).getDialogues().get(4));
					heroins[1].deliveringScenes(scenes.get(1).getDialogues().get(5));
					hero[0].deliveringScenes(scenes.get(2).getDialogues().get(6));
					villains[1].deliveringScenes(scenes.get(2).getDialogues().get(7));
					hero[0].deliveringScenes(scenes.get(2).getDialogues().get(8));
					
				   //}
				//}
		
         }

}