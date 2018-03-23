package controller;
import model.DatabaseManager;
import model.UserManager;

public class GoalController
{
	private DatabaseManager dbMan;
	private UserManager uMan;
	
	public GoalController(DatabaseManager in_dbMan, UserManager in_uMan)
	{
		dbMan = in_dbMan;
		uMan = in_uMan;
	}
	
	public boolean hasGoal()
	{
		return true;
	}
}