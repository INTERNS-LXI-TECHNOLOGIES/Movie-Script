package com.lxisoft.moviescript.movie;
public class Actor
{
  private String actorName;
  private String characterName;
  private String role;

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
}