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
		
		villainic.add("Aroda ee kalikkunnath enn OOrkkunnath Nallathaa....");
		villainic.add("Njankalikure kandathaaa....");
		villainic.add("Nee iniyum valaranam...");
		villainic.add("Kali nhan kaanich tharam...");
		villainic.add("Ne okke shishuvaa....");
		villainic.add("Theerkkada avne...");
		villainic.add("Ippo ninne nhan veruthe vidunnu....");
		villainic.add("Aal puthiyatha lee...Chidich nokk ivarod...");
		villainic.add("ne okke path janmam janikkanam...");
		villainic.add("Ninno okke basmamakkan enikkariyam...");
		
		romantic.add("Ninne aadyamayi kandath mutha ishtathilaayi");
		romantic.add("Nammalonna randallaa");
		romantic.add("Eni njanundakum koode");
		romantic.add("I love you dear");
		romantic.add("Marikkan ennem koode koottayirunnille..");
		romantic.add("Njan snehikkunnathinte pathiratti enne avan snehikkunnund..");
		romantic.add("You are my soul...");
		romantic.add("AArillenkilum njanundakum koode...");
		romantic.add("You are my siul ...");
		romantic.add("It is my time to be with you....");
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