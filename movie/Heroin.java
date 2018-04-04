package com.lxisoft.moviescript.movie;
import java.io.*;
import com.sun.media.sound.*;
import java.util.*;
public class Heroin extends Actress
{
	public void deliveringScenes(JavaSoundAudioClip scenes)
   {
	   try{
	   System.out.print("\n");;
	   scenes.play();
	   Thread.sleep(30000);
	   }catch(Exception e){System.out.print("...");}
	
   }


}