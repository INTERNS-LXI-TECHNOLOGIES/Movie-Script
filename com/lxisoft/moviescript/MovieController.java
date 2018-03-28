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
		
	}
}