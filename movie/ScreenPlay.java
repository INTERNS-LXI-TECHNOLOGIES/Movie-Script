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
  
  
  
      public void  createScenes(ArrayList<JavaSoundAudioClip> dialogueBook,Hero[] hero,Villain[] villains,Heroin[] heroins)
        {
				    ArrayList<Integer> random = new ArrayList<Integer>();
					boolean isTrue = false;
           do
			{	
			    scenes.add(new Scene());
			 // for(int i = 0;i < 3 ;i++)
			 // {
				  
					  int a = (int)  (Math.random()*dialogueBook.size());
					 // System.out.print("random"+a);
					//  for(int m = 0;m<random.size();m++)
					// {
					  // if(random.get(a)!= random.get(m))
					  // {
					    // random.add(a);
			           // scenes.get(scenes.size()-1).getDialogues().add(dialogueBook.get(a));
						 scenes.get(scenes.size()-1).getDialogues().add(dialogueBook.get(a));
						// isTrue = true;
					 //  }
					   
					// }
					 
				 // }while(isTrue==true);
			 // }
			 //scenes.add(new Scene());
			 }while(scenes.size()<=3);
			 //for(int j=0;j<2;j++)
			 //{
				// int j = 0;
			
               //for(int k = 0;k<3;k++)
				//{					
			       //for(int l = 0;l<2;l++)
				   //{
                    System.out.print("\n                            SCENE   1                    \n");
			   
					hero[0].deliveringScenes(scenes.get(0).getDialogues().get(0));
					//villains[0].deliveringScenes(scenes.get(0).getDialogues().get(1));
					//heroins[0].deliveringScenes(scenes.get(0).getDialogues().get(2));
					//System.out.print(hero.length);
					//System.out.print(scenes.size());
					//System.out.print(scenes.get(1).getDialogues().size());
					System.out.print("\n                            SCENE   2                   \n");
					hero[1].deliveringScenes(scenes.get(1).getDialogues().get(0));
					//villains[1].deliveringScenes(scenes.get(1).getDialogues().get(1));
					//heroins[1].deliveringScenes(scenes.get(1).getDialogues().get(2));
					System.out.print("\n                            SCENE   3                   \n");
					hero[0].deliveringScenes(scenes.get(2).getDialogues().get(0));
					//villains[1].deliveringScenes(scenes.get(2).getDialogues().get(2));
					//hero[0].deliveringScenes(scenes.get(2).getDialogues().get(2));
					
				   //}
				//}
		
         }

}