import java.util.*;
public class MovieController
{
	Movie movie = new Movie();
	DirectorController directorController;
	public void createMovie()
	{
		directorController = new DirectorController();
		Director director = directorController.createDirector();
		movie.setDirector(director);
		String movieName = directorController.decideMovieName();
		movie.setMovieName(movieName);
		String movieType = directorController.decideMovieType();
		movie.setMovieType(movieType);
		ScriptWriter scriptWriter = directorController.decideScriptWriter();
		movie.setScriptWriter(scriptWriter);
		ArrayList<Actor> actors = directorController.decideActors();
		movie.setActors(actors);
		Script script=directorController.assignScript(movie);
		movie.setScript(script);	
	}
	public void displayMovie()
	{
		String charName=null;
		System.out.println("=====================================");
		System.out.println("Film Title     :"+movie.getMovieName());
		System.out.println("Director  	   :"+movie.getDirector().getDirectorName());
		System.out.println("Type of Movie  :"+movie.getMovieType());
		System.out.println("Script Writer  :"+movie.getScriptWriter().getScriptWriterName());
		System.out.println("--------------------------------");
		System.out.println("Actors ");
		for(Actor a:movie.getActors())
		{
			System.out.println(a.getActorName()+"("+a.getCharecterName()+")");
		}
		System.out.println("Script of the Movie");
		System.out.println("============================");
		for(Scene s:movie.getScript().getScene())
		{
			for(Action a:s.getActions())
			{
				int t=Integer.parseInt(a.getCharecterName());
				for(Actor ac:movie.getActors())
				{
					if((ac.getActorType())==t)
					{
						charName=ac.getCharecterName();
					}
				}
				System.out.print(charName+"("+a.getDialogueType()+")"+"		:"+a.getDialogueContent());
				System.out.println();
			}
			System.out.println("---------End of a scene--------");
		}
		System.out.println("________The End_________");
	}
}