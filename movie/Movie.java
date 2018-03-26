package com.lxisoft.moviescript.movie;
public class Movie
{
	private String movieName;
	private Director director;
	private ScriptWriter scriptwriter;
	private Actor actor;
	
	  public void setMovieName(String movieName)
	   {
		this.movieName = movieName;
	   }	
	  public String getMovieName()
	  {
		  return movieName;
	  }
	  public void setDirector(Director director)
	  {
		  this.director = director;
	  }
	  public Director getDirector()
	  {
		  return director;
	  }
	  public void setScriptWriter(ScriptWriter scriptwriter)
	  {
		  this.scriptwriter = scriptwriter;
	  }
	  public ScriptWriter getScriptWriter()
	  {
		  return scriptwriter;
	  }
	  public void setActor(Actor actor)
	  {
		  this.actor = actor; 
	  }
	  public Actor getActor()
	  {
		  return actor;
	  }

	  
	  
        public void playMovie()
          {
			  
			  
			 setDirector(new Director()); 
	         setMovieName("RAVANAPRABHU");
			 System.out.print("\n"); 
			 System.out.print("               **********************************************************             ");
             System.out.print("\n               *                                                        *           ");
             System.out.print("\n               *                    "+getMovieName()+"                        *           ");
             System.out.print("\n               *                                                        *           ");			 
			 System.out.println("                                                                   \n");
			                           
			 getDirector().setDirectorName("SHAJI KAILAS");
			 System.out.print("                            Director Name: "+getDirector().getDirectorName()+"                           \n");

          }

}