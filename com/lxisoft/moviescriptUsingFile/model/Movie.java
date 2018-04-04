package com.lxisoft.moviescriptUsingFile.model;
import java.util.List;

public class Movie {
	
	private String name;
	private Director director;
	private ScriptWriter scriptWriter;
	private List<Actor> actorList;
	private Script script;
	
	//Constructor
	public Movie(Director director, ScriptWriter scriptWriter, List<Actor> actorList, Script script){
		this.director = director;
		this.scriptWriter = scriptWriter;
		this.actorList = actorList;
		this.script = script;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public ScriptWriter getScriptWriter() {
		return scriptWriter;
	}
	public void setScriptWriter(ScriptWriter scriptWriter) {
		this.scriptWriter = scriptWriter;
	}
	public List<Actor> getActorList() {
		return actorList;
	}
	public void setActorList(List<Actor> actorList) {
		this.actorList = actorList;
	}
	public Script getScript() {
		return script;
	}
	public void setScript(Script script) {
		this.script = script;
	}



}
