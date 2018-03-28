import java.util.*;
public class Scene
{
	private int sceneNumber;
	private ArrayList<Action> actions=new ArrayList<Action>();
	
	public void setSceneNumber(int sceneNo)	
	{
		this.sceneNumber=sceneNo;
	}
	public int getSceneNumber()
	{
		return this.sceneNumber;
	}
	public void setActions(ArrayList<Action> act)	
	{
		this.actions=act;
	}
	public ArrayList<Action> getActions()
	{
		return this.actions;
	}
}