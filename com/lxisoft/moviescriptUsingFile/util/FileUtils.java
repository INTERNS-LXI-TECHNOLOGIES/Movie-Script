package com.lxisoft.moviescriptUsingFile.util;
import java.io.*;

public class FileUtils{
	
	private static FileUtils fileUtils = null;
	File file;
	PrintWriter printWriter;
	
	//Singleton
	private FileUtils(){}
	public static FileUtils getInstance(){
		if (fileUtils==null){
			fileUtils = new FileUtils();
		}
		return fileUtils;
	}
	
	public void create(){
		try{
			file = new File("D:\\notepad-workspace\\LXI\\Movie-Script\\com\\lxisoft\\moviescriptUsingFile\\file\\file3.txt");
			printWriter = new PrintWriter(file);
			System.out.println("\n inside create");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void write(String dialogues){
		printWriter.println(dialogues);
		printWriter.flush();
		printWriter.close();
		System.out.println("\n inside write");
	}



}