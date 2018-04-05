import java.util.*;
public class ScriptWriterController
{
	DialogueBook dialogueBook=new DialogueBook();
	ArrayList<Action> actions;
	ArrayList<Scene> scenes;
	Script script;
	Scene scene;
	public Script createScript(Movie movie)
	{
		scenes=new ArrayList<Scene>();
		script=new Script();
		int numberOfScenes=(int)(Math.random()*5+1);
		for(int i=0;i<numberOfScenes;i++)
		{
			actions = new ArrayList<Action>();
			scene=new Scene();
			int numberOfComicDialogue = (int)(Math.random()*10);
			int numberOfHeroicDialogue = (int)(Math.random()*10);
			int numberOfVillainicDialogue = (int)(Math.random()*10);
			int numberOfRomanticDialogue = (int)(Math.random()*10);
			int numberOfActions = numberOfComicDialogue+numberOfHeroicDialogue+numberOfVillainicDialogue+numberOfRomanticDialogue;
			for(int j=0;j<numberOfActions;j++)
			{
				Action action;
				int typeOfAction=(int)(Math.random()*4+1);
				if(typeOfAction==1&&numberOfComicDialogue>0)
				{
					action=new Action();
					int dialogueIndex = (int)(Math.random()*10);
					String dialogue = dialogueBook.getComic().get(dialogueIndex);
					action.setDialogueContent(dialogue);
					action.setDialogueType("comic");
					for(Actor a:movie.getActors())
					{
						if(a.getActorType()=="comic")
						{
							action.setCharecterName(a.getCharecterName());
						}
					}
					for(Actor a:movie.getActors())
					{
						if(a.getActorType()=="comic")
						{
							action.setDialogueType(a.getCharecterName());
						}
					}
					numberOfComicDialogue--;
					actions.add(action);	
				}
				if(typeOfAction==2&&numberOfHeroicDialogue>0)
				{
					action=new Action();
					int dialogueIndex = (int)(Math.random()*10);
					String dialogue = dialogueBook.getHeroic().get(dialogueIndex);
					action.setDialogueContent(dialogue);
					action.setDialogueType("heroic");
					for(Actor a:movie.getActors())
					{
						if(a.getActorType()=="heroic")
						{
							action.setCharecterName(a.getCharecterName());
						}
					}
					for(Actor a:movie.getActors())
					{
						if(a.getActorType()=="heroic")
						{
							action.setDialogueType(a.getCharecterName());
						}
					}
					numberOfHeroicDialogue--;
					actions.add(action);
				}
				if(typeOfAction==3&&numberOfVillainicDialogue>0)
				{
					action=new Action();
					int dialogueIndex = (int)(Math.random()*10);
					String dialogue = dialogueBook.getVillainic().get(dialogueIndex);
					action.setDialogueContent(dialogue);
					action.setDialogueType("villainic");
					for(Actor a:movie.getActors())
					{
						if(a.getActorType()=="villainic")
						{
							action.setCharecterName(a.getCharecterName());
						}
					}
					for(Actor a:movie.getActors())
					{
						if(a.getActorType()=="villainic")
						{
							action.setDialogueType(a.getCharecterName());
						}
					}
					numberOfVillainicDialogue--;
					actions.add(action);
				}
				if(typeOfAction==4&&numberOfRomanticDialogue>0)
				{
					action=new Action();
					int dialogueIndex = (int)(Math.random()*10);
					String dialogue = dialogueBook.getRomantic().get(dialogueIndex);
					action.setDialogueContent(dialogue);
					action.setDialogueType("romantic");
					for(Actor a:movie.getActors())
					{
						if(a.getActorType()=="romantic")
						{
							action.setCharecterName(a.getCharecterName());
						}
					}
					for(Actor a:movie.getActors())
					{
						if(a.getActorType()=="romantic")
						{
							action.setDialogueType(a.getCharecterName());
						}
					}
					numberOfRomanticDialogue--;
					actions.add(action);
				}
					
			}
			scene.setActions(actions);
			scene.setSceneNumber(i);
			scenes.add(scene);
		}
		script.setScene(scenes);
		return script;
	}
}