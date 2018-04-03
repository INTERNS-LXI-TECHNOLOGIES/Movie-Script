package com.lxisoft.moviescript.movie;
import java.util.*;
public class Director
{
	private String directorName;
	
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
	    
		
		
		
		
		public void roleCasting(Hero[] hero,Villain[] villains,Heroin[] heroins)
		{
			 setNoOfActors((int) (Math.random()*5)+1);
			 setNoOfActress((int) (Math.random()*5)+1);
		
			
			 hero[0].setCharacterName("KARTHIKEYAN");
			 hero[0].setRole("HERO");
			 hero[0].setActorName("MOHANLAL");
			 hero[1].setCharacterName("NEELAKANDAN");
			 hero[1].setRole("HERO");
			 hero[1].setActorName("MOHANLAL");
			 villains[0].setCharacterName("SEKHARAN NAMBIAR");
			 villains[0].setRole("VILLAIN");
			 villains[0].setActorName("NAPOLEAN");
			 villains[1].setCharacterName("RAJENDRAN NAMBIAR");
			 villains[1].setRole("VILLAIN");
			 villains[1].setActorName("VIJAYA RAGHAVAN");
			   heroins[0].setActressName("VASUNDHARA");
			   heroins[0].setCharacterName("JANAKI");
			   heroins[0].setRole("HEROIN");
			   heroins[1].setActressName("BHANUMATHI");
			   heroins[1].setCharacterName("REVATHI");
			   heroins[1].setRole("GUEST APPEARENCE");
			   
			   
			for(int i = 0;i<2;i++)
			{				
			 System.out.print("\n                       "+hero[i].getRole()+":"+hero[i].getActorName()+" AS "+hero[i].getCharacterName()+"         ");
	         System.out.print("\n                       "+villains[i].getRole()+":"+villains[i].getActorName()+" AS "+villains[i].getCharacterName()+"           ");		
		     System.out.print("\n                       "+heroins[i].getRole()+":"+heroins[i].getActressName()+" AS "+heroins[i].getCharacterName()+"               ");
		    }
		}
		public void sceneSelection(ScriptWriter scriptwriter,Hero[] hero,Villain[] villains,Heroin[] heroins)
		{
			scriptwriter.createScript(hero,villains,heroins);
		
		}
		
	
   
   
 }