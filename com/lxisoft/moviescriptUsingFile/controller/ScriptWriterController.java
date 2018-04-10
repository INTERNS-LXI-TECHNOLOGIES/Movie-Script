package com.lxisoft.moviescriptUsingFile.controller;
import com.lxisoft.moviescriptUsingFile.model.*;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
* The ScriptWriterController class: 
*	a) writes Script, 
*	b) writes Scenes, 
*	c) writes Actions
*
* @author  Vyshnav Ramesh
* @version 1.0
* @since   05*04-2018 
*/

public class ScriptWriterController{
	
	private List<Scene> sceneList;
	private List<Action> actionList;
	private Scene scene;
	private int heroDialogues, heroineDialogues, villainDialogues, comedianDialogues;
	public static final int ACTION_HEROIC=1, ACTION_HEROINIC=2, ACTION_VILLAINOUS=3, ACTION_COMIC=4;
	
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
	
	//Write Actions
	private List<Action> writeActions(List<Actor> actorList, DialogueBook dialogueBook){
		
		String dialogue, characterName;
		Action action;
		actionList = new ArrayList<Action>();
		int randomIndexNumber, randomAction, 
			totalDialogues = heroDialogues+heroineDialogues+villainDialogues+comedianDialogues;
		
		for(int i=1; i<=totalDialogues; i++){			
			action = new Action();
			randomIndexNumber = ThreadLocalRandom.current().nextInt(0,4); // Change 4 When Dialogue File is Modified	
			randomAction = ThreadLocalRandom.current().nextInt(1,5); 
			dialogue=""; 
			characterName="";
			
			if(randomAction==ACTION_HEROIC && heroDialogues>0){
				dialogue = dialogueBook.getHeroicArray()[randomIndexNumber];
				for(Actor actor : actorList){
					if(actor.getRole()=="hero"){
						characterName = actor.getCharacterName();
					}
				}
				heroDialogues--;
				
			} else if(randomAction==ACTION_HEROINIC && heroineDialogues>0){
				dialogue = dialogueBook.getRomanticArray()[randomIndexNumber];
				for(Actor actor : actorList){
					if(actor.getRole()=="heroine"){
						characterName = actor.getCharacterName();
					}
				}
				heroineDialogues--;
				
			} else if(randomAction==ACTION_VILLAINOUS && villainDialogues>0){
				dialogue = dialogueBook.getVillainousArray()[randomIndexNumber];
				for(Actor actor : actorList){
					if(actor.getRole()=="villain"){
						characterName = actor.getCharacterName();
					}
				}
				villainDialogues--;
				
			} else if(randomAction==ACTION_COMIC && comedianDialogues>0){
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
			
			//Verify Dialogue And Character-Name Are Not Null
			if((dialogue!="") && (characterName!="")){
				action.setDialogue(dialogue);
				action.setCharacterName(characterName);
				actionList.add(action);	
			}				
		}
		return actionList;
	}
}