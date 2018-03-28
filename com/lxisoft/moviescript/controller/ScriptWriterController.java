package com.lxisoft.moviescript.controller;
import com.lxisoft.moviescript.model.*
import java.util.List;

public class ScriptWriterController(){
	
	
	
	//Write Script
	public Script writeScript(Script script){
		script.setSceneList(writeScenes());
		return script;
	}
	
	//Write Scenes
	private List<Scene> writeScenes(){
		
		for(int i=1;i<=3;i++){	//Change 3 When More Scenes are Added
			scene.setNumber(1);
			randomSceneType = ThreadLocalRandom.current().nextInt(1,5); // Change 5 When More Scene Types are added
			if(randomSceneType==1){scene.setType("heroic");}
				else if(randomSceneType==2){scene.setType("heroinic");}
				else if(randomSceneType==3){scene.setType("villainous");}
				else if(randomSceneType==4){scene.setType("comic");}
			scene.setActionList(writeActions());
			sceneList.add(scene);
		}
		return sceneList;
	}
	
	//Write Actions
	private List<Action> writeActions(){
		
		for(int i=1;i<=3;i++){
			
			randomActionNumber = ThreadLocalRandom.current().nextInt(1,3); // Change 3 When DialogueBook is Modified			
			
			if(scene.getType()=="heroic"){
				dialogue = dialogueBook.heroicArray()[randomActionNumber];
				for(Actor actor : actorList){
					if(actor.getRole()=="hero"){
						characterName = actor.getCharacterName();
					}
				} 
			} else if(scene.getType()=="heroinic"){
				dialogue = dialogueBook.romanticArray()[randomActionNumber];
				for(Actor actor : actorList){
					if(actor.getRole()=="heroine"){
						characterName = actor.getCharacterName();
					}
				}
			} else if(scene.getType()=="villainous"){
				dialogue = dialogueBook.villainousArray()[randomActionNumber];
				for(Actor actor : actorList){
					if(actor.getRole()=="villain"){
						characterName = actor.getCharacterName();
					}
				}
			} else if(scene.getType()=="comic"){
				dialogue = dialogueBook.getComicArray()[randomActionNumber];
				for(Actor actor : actorList){
					if(actor.getRole()=="comedian"){
						characterName = actor.getCharacterName();
					}
				}
			}
			action.setDialogue(dialogue);
			action.setCharacterName(characterName);
			actionList.add(action);					
		}
		return actionList;
	}
}