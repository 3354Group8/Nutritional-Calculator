package model;

public class FoodItem 
{
	private String name;
	private int calories;
	private int quantity;
	
	public FoodItem(String str, int num1, int num2)
	{
		name=str;
		calories=num1;
		quantity=num2;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String str) 
	{
		name=str;
	}
	
	public int getCalories() 
	{
		return calories;
	}
	
	public void setCalories(int num) 
	{
		calories=num;
	}
	
	public int getQuantity()
	{
		return quantity;
	}
	
	public void setQuantity(int num)
	{
		quantity=num;
	}
	
	public int getTotalCalories()
	{
		return quantity*calories;
	}	
}
