public class Action
{
	private String charecterName;
	private String dialogueContent;
	private String dialogueType;
	
	public void setCharecterName(String name)
	{
		this.charecterName=name;
	}
	public String getCharecterName()
	{
		return this.charecterName;
	}
	public void setDialogueContent(String dialogue)
	{
		this.dialogueContent=dialogue;
	}
	public String getDialogueContent()
	{
		return this.dialogueContent;
	}
	public void setDialogueType(String dType)
	{
		this.dialogueType=dType;
	}
	public String getDialogueType()
	{
		return this.dialogueType;
	}
}