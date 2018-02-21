import java.util.ArrayList;

public class itemManager 
{
	private ArrayList<item> items;
	
	public itemManager()
	{
		items=new ArrayList<item>();
	}
	
	public void addItem(item food)
	{
		items.add(food);
		System.out.println(food.getItemName() + "was added");
	}
	
	public int itemCount()
	{
		return items.size();
	}
	
	public item findItem(String str)
	{
		for(int x=0; x<items.size(); x++)
		{
			if(items.get(x).getItemName().equalsIgnoreCase(str))
			{
				return items.get(x);
			}
		}
		System.out.println("Item not found");
		return null;
	}
	
	public void deleteItem(String str)
	{
		for(int x=0; x<items.size(); x++)
		{
			if(items.get(x).getItemName().equalsIgnoreCase(str))
			{
				items.remove(x);
				System.out.println("Item was removed");
			}
		}
	}
}
