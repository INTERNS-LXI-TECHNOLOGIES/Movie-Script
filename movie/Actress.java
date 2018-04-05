package com.lxisoft.moviescript.movie;
import java.io.*;
import com.sun.media.sound.*;
import java.util.*;
public  abstract class Actress
{
   private  String actressName;
   private String role;
   private String characterName;
   
    public void setActressName(String actressName)
	{
		this.actressName = actressName;
	}
	public String getActressName()
	{
		return actressName;
	}
	public void setRole(String role)
	{
		this.role = role;
	}
	public String getRole()
	{
		return role;
	}
	public void setCharacterName(String characterName)
	{
		this.characterName = characterName;
	}
	public String getCharacterName()
	{
		return characterName;
	}
	
	public abstract void deliveringScenes(JavaSoundAudioClip scenes);
	//,ArrayList<BufferedReader> dialogues);
	
}