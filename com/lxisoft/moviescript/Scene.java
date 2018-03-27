public class Scene
{
	private int sceneNumber;
	private ArrayList<Action> actions=new ArrayList<Action>()
	
	public void setSceneNumber(int sceneNo)	
	{
		this.sceneNumber=sceneNo;
	}
	public int getSceneNumber()
	{
		retun this.sceneNumber;
	}
	public void setActions(ArrayList<Action> act)	
	{
		this.actions=act;
	}
	public ArrayList<Action> getActions()
	{
		retun this.actions;
	}
}