package com.lxisoft.moviescript.controller;
import com.lxisoft.moviescript.model.*;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ScriptWriterController{
	
	private List<Scene> sceneList;
	private List<Action> actionList;
	private Scene scene;
	private int heroDialogues, heroineDialogues, villainDialogues, comedianDialogues;
	
	//Write Script
	public Script writeScript(Script script, List<Actor> actorList, DialogueBook dialogueBook){
		sceneList = writeScenes(actorList, dialogueBook);
		script.setSceneList(sceneList);
		return script;
	}
	
	//Write Scenes
	private List<Scene> writeScenes(List<Actor> actorList, DialogueBook dialogueBook){
		sceneList = new ArrayList<Scene>();
		int randomSceneType, randomNoOfScenes = ThreadLocalRandom.current().nextInt(3,6);
		
		for(int i=1;i<=randomNoOfScenes;i++){	
			scene = new Scene();
			randomSceneType = ThreadLocalRandom.current().nextInt(1,5);
			heroDialogues = ThreadLocalRandom.current().nextInt(1,3); 
			heroineDialogues = ThreadLocalRandom.current().nextInt(1,3); 
			villainDialogues = ThreadLocalRandom.current().nextInt(1,3); 
			comedianDialogues = ThreadLocalRandom.current().nextInt(1,3);
			
			scene.setNumber(i);
			
			switch(randomSceneType){
				case 1:	scene.setType("heroic");
						heroDialogues=ThreadLocalRandom.current().nextInt(3,5);
						break;
				case 2:	scene.setType("heroinic");
						heroineDialogues=ThreadLocalRandom.current().nextInt(3,5);
						break;
				case 3:	scene.setType("villainous");
						villainDialogues=ThreadLocalRandom.current().nextInt(3,5);
						break;
				case 4: scene.setType("comic");
						comedianDialogues=ThreadLocalRandom.current().nextInt(3,5);
						break;
			}
		
			actionList = writeActions(actorList, dialogueBook);
			scene.setActionList(actionList);
			sceneList.add(scene);
		}
		return sceneList;
	}
	
	//Write Action
	private List<Action> writeActions(List<Actor> actorList, DialogueBook dialogueBook){
		
		String dialogue, characterName;
		Action action;
		actionList = new ArrayList<Action>();
		int randomIndexNumber, randomActionType, 
			totalDialogues = heroDialogues+heroineDialogues+villainDialogues+comedianDialogues;
		
		for(int i=1; i<=totalDialogues; i++){			
			action = new Action();
			randomIndexNumber = ThreadLocalRandom.current().nextInt(0,4); // Change 4 When DialogueBook is Modified	
			randomActionType = ThreadLocalRandom.current().nextInt(1,5); // 1 -> hero, 2-> heroine, 3 -> villain, 4 -> comedian
			dialogue=""; 
			characterName="";
			
			if(randomActionType==1 && heroDialogues>0){
				dialogue = dialogueBook.getHeroicArray()[randomIndexNumber];
				for(Actor actor : actorList){
					if(actor.getRole()=="hero"){
						characterName = actor.getCharacterName();
					}
				}
				heroDialogues--;
				
			} else if(randomActionType==2 && heroineDialogues>0){
				dialogue = dialogueBook.getRomanticArray()[randomIndexNumber];
				for(Actor actor : actorList){
					if(actor.getRole()=="heroine"){
						characterName = actor.getCharacterName();
					}
				}
				heroineDialogues--;
				
			} else if(randomActionType==3 && villainDialogues>0){
				dialogue = dialogueBook.getVillainousArray()[randomIndexNumber];
				for(Actor actor : actorList){
					if(actor.getRole()=="villain"){
						characterName = actor.getCharacterName();
					}
				}
				villainDialogues--;
				
			} else if(randomActionType==4 && comedianDialogues>0){
				dialogue = dialogueBook.getComicArray()[randomIndexNumber];
				for(Actor actor : actorList){
					if(actor.getRole()=="comedian"){
						characterName = actor.getCharacterName();
					}
				}
				comedianDialogues--;
			} else{
				--i;
			}
			
			//Verify The Dialogue And Character-Name
			if((dialogue!="") && (characterName!="")){
				action.setDialogue(dialogue);
				action.setCharacterName(characterName);
				actionList.add(action);	
			}				
		}
		return actionList;
	}
}