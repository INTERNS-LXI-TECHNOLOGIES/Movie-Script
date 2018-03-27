package com.lxisoft.moviescript.movie;
import java.util.*;
public class Director
{
	private String directorName;
	private Actor hero;
	private Actor comicActor;
	private Actor villain;
	private Actress heroin;
	private Actress comicActress;
	private int noOfActors;
	private int noOfActress;
	
	  public void setDirectorName(String directorName)
	   {
		this.directorName = directorName;
	   }
	  public String getDirectorName()
	   {
		 return directorName; 
	   }
      public void setHero(Actor hero)
	  {
		  this.hero = hero;
	  }		  
	  public Actor getHero()
	  {
		  return hero;
	  }
       public void setNoOfActors(int noOfActors)
	   {
		   this.noOfActors = noOfActors;
	   }
	   public int getNoOfActors()
	   {
		   return noOfActors;
	   }
	   public void setNoOfActress(int noOfActress)
	   {
		   this.noOfActress = noOfActress;
	   }
	   public int getNoOfActress()
	   {
		   return noOfActress;
	   }
	    
		
		
		
		
		public void roleCasting()
		{
			getHero().setCharacterName("KARTHIKEYAN");
			setNoOfActors((int) (Math.random()*5)+1);
			setNoOfActress((int) (Math.random()*5)+1);
			setHero(new Hero());
			getHero().setRole("HERO");
			getHero().setActorName("MOHANLAL");
			System.out.print("\n          "+getHero().getRole()+":"+getHero().getActorName()+" AS "+getHero().getCharacterName()+"         ");
			
			
			
		}
		
		public void sceneSelection()
		{
			
		}
		
	
   
}