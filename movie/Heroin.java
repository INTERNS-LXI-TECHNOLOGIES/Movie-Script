package com.lxisoft.moviescript.movie;
import java.io.*;
import com.sun.media.sound.*;
import java.util.*;
public class Heroin extends Actress
{
	public void deliveringScenes(JavaSoundAudioClip scenes)
	//,ArrayList<BufferedReader> dialogues)
   {
	   try{
	   System.out.print("\n");
	  /* for(int i = 0;i<3;i++)
	   {
		   dialogues.get(i).readLine();
	   }*/
	   scenes.play();
	   Thread.sleep(30000);
	   }catch(Exception e){System.out.print("...");}
	
   }


}