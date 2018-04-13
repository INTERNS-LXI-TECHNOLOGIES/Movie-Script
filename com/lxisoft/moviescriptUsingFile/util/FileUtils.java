package com.lxisoft.moviescriptUsingFile.util;
import java.io.*;

public class FileUtils{
	
	private static FileUtils fileUtils = null;
	File file;
	PrintWriter printWriter;
	BufferedReader bufferedReader;
	
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
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void write(String dialogues){
		printWriter.println(dialogues);
		printWriter.flush();
		printWriter.close();
 	}

	public void open() throws IOException{
		FileReader fileReader = new FileReader(file);
		bufferedReader = new BufferedReader(fileReader);	
	}
	
	public String read() throws IOException{
		return bufferedReader.readLine();
	}

	public void  close() throws IOException{
		bufferedReader.close();
	}
}