package com.lxisoft.moviescript.movie;
public class ScriptWriter
{
	private String scriptWriterName;
	private Script script;
	
	 public void setScriptWriterName(String scriptWriterName)
	  {
		this.scriptWriterName = scriptWriterName; 
	  }
	  public String getScriptWriterName()
	   {
		 return scriptWriterName;  
	   }
	  public void setScript(Script script)
	   {
		 this.script = script;  
	   }	  
	  public Script getScript()
	   {
		return script;  
	   }	  
	 

class Script
{
   private Scene scenes;
   
   public void setScenes(Scene  scenes)
    {
	   this.scenes = scenes;   
    }
   public Scene getScenes()
    {
	 return scenes;   
    }
   
}	 
	
class Scene
 {
	private String dialogue;
	
	 public void setScene1(String scene1)
	 {
		 this.scene1 = scene1;
	 }	 
	 public String getScene1()
	 {
		 return scene1;
	 }
	 
	 
	 
	 
 }	
 
	   

}