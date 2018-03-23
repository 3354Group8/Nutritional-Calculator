package controller;
import model.DatabaseManager;
import model.UserManager;

public class FoodController
{
	private DatabaseManager dbMan;
	private UserManager uMan;
	
	public FoodController(DatabaseManager in_dbMan, UserManager in_uMan)
	{
		dbMan = in_dbMan;
		uMan = in_uMan;
	}
}