import java.util.concurrent.ThreadLocalRandom;

public class MovieController {
		
	private DialogueBook dialogueBook;
	private Director director;
	List<Actor> actorList;
	

	//Create Director
	public void createDirector(){
		director = new Director("Sathyan Anthikaad");
	}
	
	//Create Script-Writer
	public void createScriptWriter(){
		scriptWriter = new ScriptWriter("Sreenivasan");
	}
	
	//Set Character NamespaceAlias
	public void setCharacterNames(){
		
	}
	
	//Create Dialog-Book	
	public void createDialogueBook(){
		dialogueBook = new DialogueBook({"comedyDialogue1","comedyDialogue2"},
									{"romanticDialogue1","romanticDialogue2"},
									{"heroicDialogue1","heroicDialogue2"},
									{"villainousDialogue1","villainousDialogue2"});
	}
	
	//Set Character Names and Roles
	public void setCharacters(){
		actorList = new List<Actor>();
		
		Actor actor1 = new Actor("A","hero");
		Actor actor2 = new Actor("B","heroine");
		Actor actor3 = new Actor("C","villain");
		Actor actor4 = new Actor("D","comedian");
		
		actorList.add(actor1);
		actorList.add(actor2);
		actorList.add(actor3);
		actorList.add(actor4);	
	}
	
	//Write Script
	public void createScript(){
		
		scriptWriter.writeScript();
	
	}
	
	
}