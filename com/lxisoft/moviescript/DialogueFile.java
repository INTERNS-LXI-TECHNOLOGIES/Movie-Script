import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.*;
public class DialogueFile
{
	List<String> list1;
	List<String> list2;
	List<String> list3;
	List<String> list4;
	
	DialogueFile()
	{
		try
		{
			File file1=new File("D:\\Movie-Script\\com\\lxisoft\\moviescript\\comicdialogues.txt");
			boolean c=file1.createNewFile();
			FileWriter fr1=new FileWriter(file1);
			fr1.write(" Mothalaleeee janka jaka jaka\n Ashane koladichu\n Bloody gramma vasies\n Dont do dont do\n Ivan pottana sare\n Nam polum ariyathe nammaladolokamayi shajiyetta\n Ediye foodaayo\n people call me dude\n Enthonnade ith\n ente athippara ammachee..\n");
			fr1.flush();
			fr1.close();
			File file2=new File("D:\\Movie-Script\\com\\lxisoft\\moviescript\\heroicdialogues.txt");
			boolean h=file2.createNewFile();
			FileWriter fr2=new FileWriter(file2);
			fr2.write("Uvv Sarenmaru ulathum..\n Varoo namukk steshan vare pokam..\n Savari giri giri..\n Po mone dinesha..\n Amedyam koottikuzhach....\n neelakandan karthikeyan..\n 2 janmam ne eniyum janikkanam..\n Poda poyi tharathil kalikk...\n Ale ariyillenkil ivarod chodichal madhi..\n aa sare eppo ethi..");
			fr2.flush();
			fr2.close();
			File file3=new File("D:\\Movie-Script\\com\\lxisoft\\moviescript\\villainicdialogues.txt");
			boolean v=file3.createNewFile();
			FileWriter fr3=new FileWriter(file3);
			fr3.write("Aroda ee kalikkunnath enn OOrkkunnath Nallathaa....\n Njankalikure kandathaaa....\n Nee iniyum valaranam...\n Kali nhan kaanich tharam...\n Ne okke shishuvaa....\n Theerkkada avne...\n Ippo ninne nhan veruthe vidunnu....\n Aal puthiyatha lee...Chidich nokk ivarod...\nne okke path janmam janikkanam...\n Ninno okke basmamakkan enikkariyam...");
			fr3.flush();
			fr3.close();
			File file4=new File("D:\\Movie-Script\\com\\lxisoft\\moviescript\\romanticdialogues.txt");
			boolean r=file4.createNewFile();
			FileWriter fr4=new FileWriter(file4);
			fr4.write("Ninne aadyamayi kandath mutha ishtathilaayi\nNammalonna randallaa\nEni njanundakum koode\nI love you dear\nMarikkan ennem koode koottayirunnille..\nNjan snehikkunnathinte pathiratti enne avan snehikkunnund..\nYou are my soul...\nAArillenkilum njanundakum koode...\nYou are my siul ...\nIt is my time to be with you....");
			fr4.flush();
			fr4.close();
		}
		catch(Exception ex)
		{
			
		}
	}
	public void readDialoguesFromFiles()
	{
		list1=new ArrayList<String>();
		list2=new ArrayList<String>();
		list3=new ArrayList<String>();
		list4=new ArrayList<String>();
		BufferedReader br1,br2,br3,br4;
		try{
		br1=new BufferedReader(new FileReader("D:\\Movie-Script\\com\\lxisoft\\moviescript\\comicdialogues.txt"));
		String line;
		while((line=br1.readLine())!=null)
		{
			list1.add(line);
		}
		br1.close();
		br2=new BufferedReader(new FileReader("D:\\Movie-Script\\com\\lxisoft\\moviescript\\heroicdialogues.txt"));
		while((line=br2.readLine())!=null)
		{
			list2.add(line);
		}
		br2.close();
		br3=new BufferedReader(new FileReader("D:\\Movie-Script\\com\\lxisoft\\moviescript\\villainicdialogues.txt"));
		while((line=br3.readLine())!=null)
		{
			list3.add(line);
		}
		br3.close();
		br4=new BufferedReader(new FileReader("D:\\Movie-Script\\com\\lxisoft\\moviescript\\romanticdialogues.txt"));
		while((line=br4.readLine())!=null)
		{
			list4.add(line);
		}
		br4.close();
		}
		catch(Exception e)
		{
			
		}
	}
	public List<String> getComic()
	{
		return this.list1;
	}
	public List<String> getHeroic()
	{
		return this.list2;
	}
	public List<String> getVillainic()
	{
		return this.list3;
	}
	public List<String> getRomantic()
	{
		return this.list4;
	}
}