
public class Item
{
	private String itemName;
	private String itemType;
	private int calories;
	
	public Item()
	{		
		itemName=null;
		itemType=null;
		calories=0;
	}
	public Item(String itemName, String itemType, int calories)
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


