package edu.utd.controller;
import edu.utd.model.DatabaseManager;
import edu.utd.model.UserManager;

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
		int i = dbMan.loadUser(uMan.getUser().getUsername(), uMan.getUser().getPassword(), uMan);		
	}

	public void saveUser() 
	{
		
	}

	public void view()
	{
		
	}
}