package controller;
import model.DatabaseManager;
import model.UserManager;

public class UserController 
{
	private DatabaseManager dbMan;
	private UserManager uMan;
	
	public UserController(DatabaseManager in_dbMan, UserManager in_uMan)
	{
		dbMan = in_dbMan;
		uMan = in_uMan;
	}
	
	public int loginUser(String username, String password)
	{
		return dbMan.loadUser(username, password, uMan);
	}
	
	public boolean signupUser(String username, String password)
	{
		return dbMan.createUser(username, password);
	}

	public void loadUser() 
	{
		
	}

	public void saveUser() 
	{
		
	}
}