package com.lxisoft.moviescript.movie;
import java.util.*;
import java.io.*;
import com.sun.media.sound.*;

public class Hero extends Actor
{

   public void deliveringScenes(JavaSoundAudioClip scenes)
   {
	   //do
	   //{
		  try{ 
		   System.out.println("\n");
		   scenes.play();
		   Thread.sleep(100000);
		  }catch(Exception e){System.out.print("...");}
	    // System.out.println(scenes.get(scenes.size()-1).getDialogues());
	  // }while(scenes.size()<=3);
	// try{  
	      //System.out.println(scenes.get(scenes.size()-1).getDialogues().get(indexOf());
	     // Thread.sleep(300000);
	   // }catch(Exception e){System.out.print("...");}
   }

}