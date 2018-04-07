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
		int numberOfScenes=(int)(Math.random()*10+1);
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
					action.setCharecterName("1");
					numberOfComicDialogue--;
					actions.add(action);	
				}
				else if(typeOfAction==2&&numberOfHeroicDialogue>0)
				{
					action=new Action();
					int dialogueIndex = (int)(Math.random()*10);
					String dialogue = dialogueBook.getHeroic().get(dialogueIndex);
					action.setDialogueContent(dialogue);
					action.setDialogueType("heroic");
					action.setCharecterName("2");
					numberOfHeroicDialogue--;
					actions.add(action);
				}
				else if(typeOfAction==3&&numberOfVillainicDialogue>0)
				{
					action=new Action();
					int dialogueIndex = (int)(Math.random()*10);
					String dialogue = dialogueBook.getVillainic().get(dialogueIndex);
					action.setDialogueContent(dialogue);
					action.setDialogueType("villainic");
					action.setCharecterName("3");
					numberOfVillainicDialogue--;
					actions.add(action);
				}
				else if(typeOfAction==4&&numberOfRomanticDialogue>0)
				{
					action=new Action();
					int dialogueIndex = (int)(Math.random()*10);
					String dialogue = dialogueBook.getRomantic().get(dialogueIndex);
					action.setDialogueContent(dialogue);
					action.setDialogueType("romantic");
					action.setCharecterName("4");
					numberOfRomanticDialogue--;
					actions.add(action);
				}
				else{
					j--;
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