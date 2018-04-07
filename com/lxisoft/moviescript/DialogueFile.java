import java.io.File;
import java.io.IOException;
public class ComedyDialogueFile
{
	public void createFile()
	{
		try
		{
			File file1=new File("D:\\Movie-Script\\com\\lxisoft\\moviescript\\comicdialogues.txt");
			boolean c=file1.createNewFile();
			FileWriter fr1=new FileWriter(file1);
			fr1.write("Mothalaleeee janka jaka jaka,Ashane koladichu,Bloody gramma vasies,dont do dont do,ivan pottana sare,nam polum ariyathe nammaladolokamayi shajiyetta,ediye foodaayo,people call me dude,Enthonnade ith,ente athippara ammachee..");
			File file2=new File("D:\\Movie-Script\\com\\lxisoft\\moviescript\\heroicdialogues.txt");
			boolean h=file2.createNewFile();
			FileWriter fr2=new FileWriter(file2);
			fr2.write("Uvv Sarenmaru ulathum..,Varoo namukk steshan vare pokam..,savari giri giri..,po mone dinesha..,Amedyam koottikuzhach....,neelakandan karthikeyan..,2 janmam ne eniyum janikkanam..,Poda poyi tharathil kalikk...,Ale ariyillenkil ivarod chodichal madhi..,aa sare eppo ethi..");
			File file3=new File("D:\\Movie-Script\\com\\lxisoft\\moviescript\\villainicdialogues.txt");
			boolean v=file3.createNewFile();
			FileWriter fr3=new FileWriter();
			fr3.write("Aroda ee kalikkunnath enn OOrkkunnath Nallathaa....,Njankalikure kandathaaa....,Nee iniyum valaranam...,Kali nhan kaanich tharam...,Ne okke shishuvaa....,Theerkkada avne...,Ippo ninne nhan veruthe vidunnu....,Aal puthiyatha lee...Chidich nokk ivarod...,ne okke path janmam janikkanam...,Ninno okke basmamakkan enikkariyam...");
			File file4=new File("D:\\Movie-Script\\com\\lxisoft\\moviescript\\romanticdialogues.txt");
			boolean r=file4.createNewFile();
			FileWriter fr4=new FileWriter();
			fr4.write("Ninne aadyamayi kandath mutha ishtathilaayi,Nammalonna randallaa,Eni njanundakum koode,I love you dear,Marikkan ennem koode koottayirunnille..,Njan snehikkunnathinte pathiratti enne avan snehikkunnund..,You are my soul...,AArillenkilum njanundakum koode...,You are my siul ...,It is my time to be with you....")
		catch(Exception ex)
		{
			
		}
	}
}