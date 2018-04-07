
import java.util.*;
public class DirectorController
{
	Director director;
	ScriptWriter scriptWriter;
	ScriptWriterController scriptWriterController;
	ArrayList<Actor> actors=new ArrayList<Actor>();
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
		scriptWriter.setScriptWriterName(name);
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
			act.setActorName(name);
			System.out.println("Enter Charecter Name");
			String charName = scan.next();
			act.setCharecterName(charName);
			System.out.println("Enter Actor Type(1 for Comedian;2 for Hero;3 for Villan;4 for Heroin)");
			int actType = scan.nextInt();
			act.setActorType(actType);
			actors.add(act);
		}
		return actors;
	}
	public Script assignScript(Movie mov)
	{
		scriptWriterController=new ScriptWriterController();
		Script script=scriptWriterController.createScript(mov);
		return script;
	}
	
}