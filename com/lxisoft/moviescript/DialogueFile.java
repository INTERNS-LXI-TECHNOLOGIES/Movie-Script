import java.io.File;
import java.io.IOException;
public class ComedyDialogueFile
{
	public void createFile()
	{
		try
		{
			File file1=new File("D:\\Movie-Script\\com\\lxisoft\\moviescript\\comedydialogues.txt");
			boolean c=file1.createNewFile();
			FileWriter fr1=new FileWriter(file1);
			fr1.write("Mothalaleeee janka jaka jaka,Ashane koladichu,Bloody gramma vasies,dont do dont do,ivan pottana sare,nam polum ariyathe nammaladolokamayi shajiyetta,ediye foodaayo,people call me dude,Enthonnade ith,ente athippara ammachee..");
			File file2=new File("D:\\Movie-Script\\com\\lxisoft\\moviescript\\herodialogues.txt");
			boolean h=file2.createNewFile();
			FileWriter fr2=new fileWriter(file2);
			fr2.write("")
		catch(Exception ex)
		{
			
		}
	}
}