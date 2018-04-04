package com.lxisoft.moviescriptUsingFile.model;

public class DialogueBook{
	
	private String[] comicArray, romanticArray, heroicArray, villainousArray;
	
	//Constructor
	public DialogueBook(){}

	public DialogueBook(String[] comicArray, String[] romanticArray, String[] heroicArray, String[] villainousArray){
		this.comicArray = comicArray;
		this.romanticArray = romanticArray;
		this.heroicArray = heroicArray;
		this.villainousArray = villainousArray;
	}

	//Getters And Setters
	public String[] getComicArray() {
		return comicArray;
	}
	public void setComicArray(String[] comicArray) {
		this.comicArray = comicArray;
	}
	public String[] getRomanticArray() {
		return romanticArray;
	}
	public void setRomanticArray(String[] romanticArray) {
		this.romanticArray = romanticArray;
	}
	public String[] getHeroicArray() {
		return heroicArray;
	}
	public void setHeroicArray(String[] heroicArray) {
		this.heroicArray = heroicArray;
	}
	public String[] getVillainousArray() {
		return villainousArray;
	}
	public void setVillainousArray(String[] villainousArray) {
		this.villainousArray = villainousArray;
	}
	
}

