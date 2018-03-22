package edu.utd.nutritioncalc.managers;

import edu.utd.nutritioncalc.domain.FoodItem;

import java.util.ArrayList;

public class FoodTracker 
{
	private ArrayList<FoodItem> list;
	
	public FoodTracker()
	{
		list=new ArrayList<FoodItem>();
	}
	
	public void addItem(FoodItem food)
	{
		list.add(food);
	}
	
	public int itemCount()
	{
		return list.size();
	}
	
	public FoodItem findItem(String str)
	{
		for(int x=0; x<list.size(); x++)
		{
			if(list.get(x).getName().equalsIgnoreCase(str))
			{
				return list.get(x);
			}
		}
		return null;
	}
	
	public void editItem(FoodItem food, String str, int num1, int num2)
	{
		food.setName(str);
		food.setCalories(num1);
		food.setQuantity(num2);
	}
	
	public void deleteItem(String str)
	{
		for(int x=0; x<list.size(); x++)
		{
			if(list.get(x).getName().equalsIgnoreCase(str))
			{
				list.remove(x);
			}
		}
	}
	
	public int getTotalCalories()
	{
		int total=0;
		for(int x=0; x<list.size(); x++)
		{
			total+=list.get(x).getTotalCalories();
		}
		return total;
	}
}
