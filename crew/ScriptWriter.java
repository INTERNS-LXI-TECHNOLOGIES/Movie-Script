package com.lxisoft.moviescript.crew;
public class ScriptWriter{

	private name;
	
	public void setName(name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public ScriptWriter(String name){
		setName(name);
	}

}