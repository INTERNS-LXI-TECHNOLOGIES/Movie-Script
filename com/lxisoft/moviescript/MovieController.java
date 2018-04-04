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
		
		System.out.print("Script of the Movie");
		System.out.println("----------------------");
		for(Scene s:movie.getScript().getScene())
		{
			for(Action a:s.getActions())
			{
				System.out.print(a.getCharecterName()+"("+a.getDialogueType()+")"+":"+a.getDialogueContent());
				System.out.println();
			}
			System.out.println("---------End of a scene--------");
		}
		System.out.println("________The End_________");
	}
}