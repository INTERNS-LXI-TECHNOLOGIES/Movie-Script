
import java.util.*;
public class DirectorController
{
	Director director;
	ScriptWriter scriptWriter;
	ArrayList<Actor> actors;
	Scanner scan = new Scanner(System.in);
	
	public Director createDirector()
	{
		director = new Director();
		System.out.println("Enter the name of Director");
		String name = scan.next();
		director.setDirectorName(name);
		return director;
	}
	public String decideMovieName()
	{
		System.out.println("Enter the Movie Name");
		String name = scan.next();
		return name;
	}
	public String decideMovieType()
	{
		System.out.println("Enter the Movie Type");
		String type = scan.next();
		return type;
	}
	public ScriptWriter decideScriptWriter()
	{
		scriptWriter = new ScriptWriter();
		System.out.println("Enter the Nmae of Script Writer");
		String name = scan.next();
		return scriptWriter;
	}
	public ArrayList<Actor> decideActors()
	{
		System.out.println("Number of Actors in the Movie");
		int number = scan.nextInt();
		for(int i=0;i<number;i++)
		{
			Actor act = new Actor();
			System.out.println("Enter Actor Name");
			String name = scan.next();
			actor.setActorName(name);
			System.out.println("Enter Charecter Name");
			String charName = scan.next();
			actor.setCharecterName(charName);
			System.out.println("Enter Actor Type");
			String actType = scan.next();
			actor.setActorType(actType);
			actors.add(act);
		}
		return actors;
	}
	
}