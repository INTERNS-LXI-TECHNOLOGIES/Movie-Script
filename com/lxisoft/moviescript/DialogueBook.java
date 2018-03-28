import java.util.*;
public class DialogueBook
{
	private ArrayList<String> comic=new ArrayList<String>();
	private ArrayList<String> heroic=new ArrayList<String>();
	private ArrayList<String> villainic=new ArrayList<String>();
	private ArrayList<String> romantic=new ArrayList<String>();
	comic.add("comedy 1");
	comic.add("comedy 2");
	comic.add("comedy 3");
	comic.add("comedy 4");
	comic.add("comedy 5");
	comic.add("comedy 6");
	comic.add("comedy 7");
	comic.add("comedy 8");
	comic.add("comedy 9");
	comic.add("comedy 10");
	
	heroic.add("heroic 1");
	heroic.add("heroic 2");
	heroic.add("heroic 3");
	heroic.add("heroic 4");
	heroic.add("heroic 5");
	heroic.add("heroic 6");
	heroic.add("heroic 7");
	heroic.add("heroic 8");
	heroic.add("heroic 9");
	heroic.add("heroic 10");
	
	villainic.add("villainic 1");
	villainic.add("villainic 2");
	villainic.add("villainic 3");
	villainic.add("villainic 4");
	villainic.add("villainic 5");
	villainic.add("villainic 6");
	villainic.add("villainic 7");
	villainic.add("villainic 8");
	villainic.add("villainic 9");
	villainic.add("villainic 10");
	
	romantic.add("romantic 1");
	romantic.add("romantic 2");
	romantic.add("romantic 3");
	romantic.add("romantic 4");
	romantic.add("romantic 5");
	romantic.add("romantic 6");
	romantic.add("romantic 7");
	romantic.add("romantic 8");
	romantic.add("romantic 9");
	romantic.add("romantic 10");
	
	
	
	
	
	public ArrayList<String> getComic()
	{
		return this.comic;
	}
	public ArrayList<String> getHeroic()
	{
		return this.heroic;
	}
	public ArrayList<String> getVillainic()
	{
		return this.villainic;
	}
	public ArrayList<String> getRomantic()
	{
		return this.romantic;
	}
}