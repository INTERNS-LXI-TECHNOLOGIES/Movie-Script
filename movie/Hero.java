package com.lxisoft.moviescript.movie;
import java.util.*;
import java.io.*;
import com.sun.media.sound.*;

public class Hero extends Actor
{

   public void deliveringScenes(JavaSoundAudioClip scenes)
   //,ArrayList<BufferedReader> dialogues)
   {
	
		  try{ 
		   System.out.println("\n");
		  /* for(int i= 0;i<3;i++)
		   {
		     dialogues.get(i).readLine();
		   }*/
		   scenes.play();
		   Thread.sleep(200000);
		  }catch(Exception e){System.out.print("...");}
	    
   }

}