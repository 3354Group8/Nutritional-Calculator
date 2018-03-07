
public class item
{
	private String itemName;
	private String itemType;
	private int calories;
	
	public item()
	{		
		itemName=null;
		itemType=null;
		calories=0;
	}
	
	public item(String itemName, String itemType, int calories)
	{
		this.itemName=itemName;
		this.itemType=itemType;
		this.calories=calories;
	}
	public String getItemName()
	{
		return itemName;
	}
	public String getItemType()
	{
		return itemType;
	}
	public int getCalories()
	{
		return calories;
	}

}


