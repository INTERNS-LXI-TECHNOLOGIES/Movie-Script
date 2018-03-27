public class Movie
{
	private String movieName;
	private String movieType;
	private Director director;
	private ScriptWriter scriptWriter;
	Private Script script;
	private ArrayList<Actor> actors=new ArrayList<Actor>();
	
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
	public void setDirector(Director direct)
	{
		this.director=direct;
	}
	public Director getDirector()
	{
		return this.director;
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
	public Arraylist<Actor> getActors()
	{
		return this.actors;
	}
	
}