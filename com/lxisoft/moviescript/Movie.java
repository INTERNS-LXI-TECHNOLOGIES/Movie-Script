import java.util.*;
public class Movie
{
	private Director director;
	private String movieName;
	private String movieType;
	private ScriptWriter scriptWriter;
	private ArrayList<Actor> actors = new ArrayList<Actor>();
	private Script script;
	
	public void setDirector(Director direct)
	{
		this.director=direct;
	}
	public Director getDirector()
	{
		return this.director;
	}
	public void setMovieName(String name)
	{
		this.movieName=name;
	}
	public String getMovieName()
	{
		return this.movieName;
	}
	public void setMovieType(String type)
	{
		this.movieType=type;
	}
	public String getMovieType()
	{
		return this.movieType;
	}
	public void setScriptWriter(ScriptWriter scriptor)
	{
		this.scriptWriter=scriptor;
	}
	public ScriptWriter getScriptWriter()
	{
		return this.scriptWriter;
	}
	public void setScript(Script scri)
	{
		this.script=scri;
	}
	public Script getScript()
	{
		return this.script;
	}
	public void setActors(ArrayList<Actor> filmActors)
	{
		this.actors=filmActors;
	}
	public ArrayList<Actor> getActors()
	{
		return this.actors;
	}
	
}