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
	
	 public void setDialogue(String dialogue)
	 {
		 this.dialogue = dialogue;
	 }	 
	 public String getDialogue()
	 {
		 return dialogue;
	 }
	 
	 public void set
	 
	 
 }	
 
	   

}