import java.util.ArrayList;

public class ItemMng 
{
	private ArrayList<Item> items;
	
	public ItemMng()
	{
		items=new ArrayList<Item>();
	}
	
	public void addItem(Item food)
	{
		items.add(food);
		System.out.println(food.getItemName() + "was added");
	}
	
	public int itemCount()
	{
		return items.size();
	}
	
	public Item findItem(String str)
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
	public int getTotalCalories()
	{
		int total=0;
		for (int x=0; x<items.size();x++)
		{
			total+=items.get(x).getCalories();
		}
		return total;
	}
}
