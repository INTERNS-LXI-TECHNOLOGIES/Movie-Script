package com.lxisoft.moviescript.movie;
import java.util.*;
import java.io.*;
import com.sun.media.sound.*;

public class Hero extends Actor
{

   public void deliveringScenes(JavaSoundAudioClip scenes)
   {
	
		  try{ 
		   System.out.println("\n");
		   scenes.play();
		   Thread.sleep(200000);
		  }catch(Exception e){System.out.print("...");}
	    
   }

}