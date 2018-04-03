package com.lxisoft.moviescript.movie;
import java.util.*;
import java.io.*;
import com.sun.media.sound.*;
public class Villain extends Actor
{

  public void deliveringScenes(JavaSoundAudioClip scenes)
   
   {
	   try{
      System.out.print("\n");
      scenes.play();
	  Thread.sleep(200000);
	   }catch(Exception e){System.out.print("...");}
	// try{  
	      //System.out.println(scenes.get(scenes.size()-1).getDialogues().get(getDialogues().size()-1));
	     // Thread.sleep(300000);
	   // }catch(Exception e){System.out.print("...");}
  }


}