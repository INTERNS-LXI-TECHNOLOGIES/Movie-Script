package com.lxisoft.moviescript.movie;
public class Screenplay
{
 	
  private ArrayList<Scene> scenes = new ArrayList<Scene>();
  public void setScenes(ArrayList<Scene> scenes)
  {
	  this.scenes = scenes;
  }
  public ArrayList<Scene> getScenes()
  {
	  return scenes;
  }
  
  public void createScenes(ArrayList<String> dialogueBook)
  {
	      
			do
			{			
			 scenes.add(new Scene());
			 
			 
			 for(int j=0;j<4;j++)
			 {
				scenes.get(scenes.size()-1).getDialogues().add(dialogueBook.get((int)Math.random()*dialogueBook.size()));
			 }
			 //scenes.add(new Scene());
			  
		  }while(scenes.size()<=3);
  }

}