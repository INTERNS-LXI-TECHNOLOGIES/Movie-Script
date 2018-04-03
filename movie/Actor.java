package com.lxisoft.moviescript.movie;
import java.io.*;
import com.sun.media.sound.*;
import java.util.*;
public abstract class Actor
{
  private String actorName;
  private String characterName;
  private String role;
  private ArrayList<Scene> scenes = new ArrayList<Scene>();

   public void setActorName(String actorName)
    {
	  this.actorName = actorName;   
    }   
   public String getActorName()
   {
	   return actorName;
   }
   public void setCharacterName(String characterName)
   {
	   this.characterName = characterName;
   }
   public String getCharacterName()
   {
	   return characterName;
   }
   public void setRole(String role)
   {
	   this.role = role;
   }
   public String getRole()
   {
	   return role;
   }
    public void setScenes(ArrayList<Scene> scenes)
  {
	  this.scenes = scenes;
  }
  public ArrayList<Scene> getScenes()
  {
	  return scenes;
  }
  
  public abstract void deliveringScenes(JavaSoundAudioClip scenes);
  
  
}