package com.lxisoft.moviescript.movie;
public class Movie
{
	private String movieName;
	private Director director;
	private ScriptWriter scriptwriter;
	private Actor[] heroes = new Hero[2];
	private Actor[] comicActors = new ComicActor[2];
	private Actor[] villains = new Villain[2];
	private Actress[] heroins = new Heroin[2];
	private Actress[] comicActresses = new ComicActress[2];

	
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
	  
       public void setHero(Actor[] hero)
	  {
		  this.heroes = hero;
	  }		  
	  public Actor[] getHero()
	  {
		  return heroes;
	  }
	  public void setComicActor(Actor[] comicActor)
	  {
		  this.comicActors = comicActor;
	  }
	  public Actor[] getComicActor()
	  {
		  return comicActors;
	  }
	  public void setVillain(Actor[] villain)
	  {
		  this.villains = villain;
	  }
	  public Actor[] getVillain()
	  {
		  return villains;
	  }
	  public void setHeroin(Actress[] heroin)
	  {
		  this.heroins = heroin;
	  }
	  public Actress[] getHeroin()
	  {
		  return heroins;
	  }
	  
	  
        public void playMovie()
          {
			  
			  
			 setDirector(new Director()); 
			 setScriptWriter(new ScriptWriter());
	         setMovieName("RAVANAPRABHU");
			 System.out.print("\n"); 
			 System.out.print("               **********************************************************             ");
             System.out.print("\n               *                                                        *           ");
             System.out.print("\n               *                    "+getMovieName()+"                        *           ");
             System.out.print("\n               *                                                        *           ");			 
			 System.out.println("                                                                   \n");
			                           
			 getDirector().setDirectorName("SHAJI KAILAS");
			 System.out.print("                            Director Name: "+getDirector().getDirectorName()+"                           \n");
             getScriptWriter().setScriptWriterName("RANJITH");
			 System.out.print("                            ScriptWriter Name: "+getScriptWriter().getScriptWriterName()+"                           \n");
			 
			 for(i= 0;i<2;i++)
			 {
			   heroes[i].setHero(new Hero());
			   comicActors[i].setComicActor(new ComicActor());
			   villains[i].setVillain(new Villain());
			   heroins[i].setHeroin(new Heroin());
			}
             getDirector().roleCasting(this.heroes,this.villains,this.heroins);  
			 getDirector().sceneSelection(this.scriptwriter,hero);
		  }

}