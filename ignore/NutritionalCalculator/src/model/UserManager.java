package model;
import java.util.ArrayList;

public class UserManager 
{
	private User user;
	private ArrayList<FoodEntry> foodEntries;
	private Goal goal;
	
	public UserManager()
	{
		foodEntries = new ArrayList<FoodEntry>();
	}
	
	public void setUser(User in_user)
	{ 
		user = in_user; 
	}
}
