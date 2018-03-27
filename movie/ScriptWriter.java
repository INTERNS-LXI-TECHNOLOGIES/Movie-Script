package com.lxisoft.moviescript.movie;
public class ScriptWriter
{
	private String scriptWriterName;
	private ScreenPlay screenPlay;
	private ArrayList<String> dialogueBook = new ArrayList<String>();
	
	 public void setScriptWriterName(String scriptWriterName)
	  {
		this.scriptWriterName = scriptWriterName; 
	  }
	  public String getScriptWriterName()
	   {
		 return scriptWriterName;  
	   }
	  public void setScreenPlay(ScreenPlay screenPlay)
	   {
		 this.screenPlay = screenPlay;  
	   }	  
	  public ScreenPlay getScreenPlay()
	   {
		return screenPlay;  
	   }	  
	  public void setDialogueBook(ArrayList<String> dialogueBook)
	  {
		  this.dialogueBook = dialogueBook;
	  }
	  public ArrayList<String> getDialogueBook()
	  {
		  return dialogueBook;
	  }
	 
	  public ScriptWriter()
	  {
		  dialogueBook.add("");
		  dialogueBook.add("");
		  dialogueBook.add("");
		  dialogueBook.add("");
		  dialogueBook.add("");
		  dialogueBook.add("");
		  dialogueBook.add("");
		  dialogueBook.add("");
		  dialogueBook.add("");
	  }
      public void createScript()
	  {
		  
		  setScreenPlay(new ScreenPlay());
		  getScreenPlay().createScenes(dialogueBook);
			  
	  }


}