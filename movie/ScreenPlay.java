package com.lxisoft.moviescript.movie;
import java.util.*;
import com.sun.media.sound.*;
import java.io.*;
public class ScreenPlay
{
 	private ArrayList<Scene> scenes = new ArrayList<Scene>();
	//private ArrayList<BufferedReader> dialogueBook = new ArrayList<BufferedReader>();
	
	
	
   public void setScenes(ArrayList<Scene> scenes)
   {
	  this.scenes = scenes;
   }
   public ArrayList<Scene> getScenes()
   {
	  return scenes;
   }
  /*public void setDialogueBook(ArrayList<BufferdReader> dialogueBook)
  {
	  this.dialogueBook = dialogueBook;
  }
  public ArrayList<BufferdReader> getDialogueBook()
 
 {
	 return dialogueBook;
  }*/	  
  
  
 /* public ScreenPlay()
			 {
			 try{
						dialogueBook.add(new BufferedReader(new InputStreamReader(new FileInputStreamReader("E:/workspace/com/lxisoft/moviescript/file/Hero.txt"))));
						dialogueBook.add(new BufferedReader(new InputStreamReader(new FileInputStreamReader("E:/workspace/com/lxisoft/moviescript/file/Heroin.txt"))));
					    dialogueBook.add(new BufferdReader(new InputStreamReader(new FileInputStreamReader("E:/workspace/com/lxisoft/moviescript/file/Villain.txt"))));
			    } catch(Exception e){System.out.print("...");}
			 
             }*/
  
      public void  createScenes(ArrayList<JavaSoundAudioClip> sceneBook,Hero[] hero,Villain[] villains,Heroin[] heroins)
        {
				    ArrayList<Integer> random = new ArrayList<Integer>();
					boolean isTrue = false;
           do
			{	
			    scenes.add(new Scene());
			 // for(int i = 0;i < 3 ;i++)
			 // {
				  
					  int a = (int)  (Math.random()*3);
					 // System.out.print("random"+a);
					//  for(int m = 0;m<random.size();m++)
					// {
					  // if(random.get(a)!= random.get(m))
					  // {
					    // random.add(a);
			           // scenes.get(scenes.size()-1).getDialogues().add(dialogueBook.get(a));
						 scenes.get(scenes.size()-1).getSoundDialogues().add(sceneBook.get(a));
						// for(int i = 0;i<3;i++)
						 //{
					       //int b = (int) (Math.random()*9)+3;
			 }while(scenes.size()<=3);
			 
			 
			 
						// isTrue = true;
					 //  }
					   
					// }
					 
				 // }while(isTrue==true);
			 // }
			 //scenes.add(new Scene());
			 //for(int j=0;j<2;j++)
			 //{
				// int j = 0;
			
               //for(int k = 0;k<3;k++)
				//{					
			       //for(int l = 0;l<2;l++)
				   //{
                    System.out.print("\n                            SCENE   1                    \n");
			   
					hero[0].deliveringScenes(scenes.get(0).getSoundDialogues().get(0));
					//villains[0].deliveringScenes(scenes.get(0).getDialogues().get(1));
					//heroins[0].deliveringScenes(scenes.get(0).getDialogues().get(2));
					//System.out.print(hero.length);
					//System.out.print(scenes.size());
					//System.out.print(scenes.get(1).getDialogues().size());
					//System.out.print("\n                            SCENE   2                   \n");
					//villains[0].deliveringScenes(scenes.get(1).getSoundDialogues().get(0),dialogueBook);
					//villains[1].deliveringScenes(scenes.get(1).getDialogues().get(1));
					//heroins[1].deliveringScenes(scenes.get(1).getDialogues().get(2));
					//System.out.print("\n                            SCENE   3                   \n");
					//heroins[0].deliveringScenes(scenes.get(2).getSoundDialogues().get(0),dialogueBook);
					//villains[1].deliveringScenes(scenes.get(2).getDialogues().get(2));
					//hero[0].deliveringScenes(scenes.get(2).getDialogues().get(1));
					
				   //}
				//}
		
         }
		}
			 
