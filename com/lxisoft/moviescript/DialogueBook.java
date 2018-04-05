import java.util.*;
public class DialogueBook
{
	private ArrayList<String> comic=new ArrayList<String>();
	private ArrayList<String> heroic=new ArrayList<String>();
	private ArrayList<String> villainic=new ArrayList<String>();
	private ArrayList<String> romantic=new ArrayList<String>();
	DialogueBook()
	{
		comic.add("Mothalaleeee janka jaka jaka");
		comic.add("Ashane koladichu");
		comic.add("Bloody gramma vasies");
		comic.add("dont do dont do");
		comic.add("ivan pottana sare");
		comic.add("nam polum ariyathe nammaladolokamayi shajiyetta");
		comic.add("ediye foodaayo");
		comic.add("people call me dude");
		comic.add("Enthonnade ith");
		comic.add("ente athippara ammachee..");
		
		heroic.add("Uvv Sarenmaru ulathum..");
		heroic.add("Varoo namukk steshan vare pokam..");
		heroic.add("savari giri giri..");
		heroic.add("po mone dinesha..");
		heroic.add("Amedyam koottikuzhach....");
		heroic.add("neelakandan karthikeyan..");
		heroic.add("2 janmam ne eniyum janikkanam..");
		heroic.add("Poda poyi tharathil kalikk...");
		heroic.add("Ale ariyillenkil ivarod chodichal madhi..");
		heroic.add("aa sare eppo ethi..");
		
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
		
		romantic.add("ninne aadyamayi kandath mutha ishtathilaayi");
		romantic.add("Nammalonna randallaa");
		romantic.add("Eni njanundakum koode");
		romantic.add("I love you dear");
		romantic.add("Marikkan ennem koode koottayirunnille..");
		romantic.add("");
		romantic.add("romantic 7");
		romantic.add("romantic 8");
		romantic.add("romantic 9");
		romantic.add("romantic 10");
	}
	
	
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