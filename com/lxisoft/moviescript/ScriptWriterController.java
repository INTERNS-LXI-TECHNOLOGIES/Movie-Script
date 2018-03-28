public class ScriptWriterController
{
	DialogueBook dialogueBook=new DialogueBook();
	ArrayList<Action> actions;
	public Script createScript(Movie movie)
	{
		int numberOfScenes=(int)(Math.random()*5+1);
		for(int i=0;i<numberOfScenes;i++)
		{
			actions = new ArrayList<Action>();
			Scene scene=new Scene();
			int numberOfComicDialogue = (int)(Math.random()*5);
			int numberOfHeroicDialogue = (int)(Math.random()*5);
			int numberOfVillainicDialogue = (int)(Math.random()*5);
			int numberOfRomanticDialogue = (int)(Math.random()*5);
			int numberOfActions = numberOfComicDialogue+numberOfHeroicDialogue+numberOfVillainicDialogue+numberOfRomanticDialogue;
			for(int j=0;j<numberOfActions;j++)
			{
				Action action;
				int typeOfAction=(int)(Math.random()*4+1);
				if(typeOfAction==1&&numberOfComicDialogue>0)
				{
					action=new Action();
					int dialogueIndex = (int)Math.random()*10);
					String dialogue = dialogueBook.getComic().get(dialogueIndex);
					action.setDialogueContent(dialogue);
					action.setDialogueType("comic");
					for(Actor a:movie.getActors())
					{
						if(a.getCharecterName()=="comic")
						{
							action.setDialogueType(a.getCharecterName())
						}
					}
					numberOfComicDialogue--;
					actions.add(action);	
				}
				if(typeOfAction==2&&numberOfHeroicDialogue>0)
				{
					action=new Action();
					int dialogueIndex = (int)Math.random()*10);
					String dialogue = dialogueBook.getHeroic().get(dialogueIndex);
					action.setDialogueContent(dialogue);
					action.setDialogueType("heroic");
					for(Actor a:movie.getActors())
					{
						if(a.getCharecterName()=="heroic")
						{
							action.setDialogueType(a.getCharecterName())
						}
					}
					numberOfHeroicDialogue--;
					actions.add(action);
				}
				if(typeOfAction==3&&numberOfVillainicDialogue>0)
				{
					action=new Action();
					int dialogueIndex = (int)Math.random()*10);
					String dialogue = dialogueBook.getVillainic().get(dialogueIndex);
					action.setDialogueContent(dialogue);
					action.setDialogueType("villainic");
					for(Actor a:movie.getActors())
					{
						if(a.getCharecterName()=="villainic")
						{
							action.setDialogueType(a.getCharecterName())
						}
					}
					numberOfVillainicDialogue--;
					actions.add(action);
				}
				if(typeOfAction==4&&numberOfRomanticDialogue>0)
				{
					action=new Action();
					int dialogueIndex = (int)Math.random()*10);
					String dialogue = dialogueBook.getRomantic().get(dialogueIndex);
					action.setDialogueContent(dialogue);
					action.setDialogueType("romantic");
					for(Actor a:movie.getActors())
					{
						if(a.getCharecterName()=="romantic")
						{
							action.setDialogueType(a.getCharecterName())
						}
					}
					numberOfRomanticDialogue--;
					actions.add(action);
				}
					
			}
			scene.setActions(actions);
			scene.setSceneNumber(i);
		}
	}
}