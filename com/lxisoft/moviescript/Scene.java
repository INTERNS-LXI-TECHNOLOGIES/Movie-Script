import java.util.*;
public class Scene
{
	private int sceneNumber;
	private List<Action> actions=new ArrayList<Action>();
	
	public void setSceneNumber(int sceneNo)	
	{
		this.sceneNumber=sceneNo;
	}
	public int getSceneNumber()
	{
		return this.sceneNumber;
	}
	public void setActions(List<Action> act)	
	{
		this.actions=act;
	}
	public List<Action> getActions()
	{
		return this.actions;
	}
}