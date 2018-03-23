package edu.utd.model;
import java.io.*;
import java.util.*;

public class DatabaseManager 
{
	public DatabaseManager() {}
	
	public int loadUser(String username, String password, UserManager uMan)
	{
		try {
		    File inFile = new File(username);
	
		    Scanner sc = new Scanner (inFile);
		    if(!password.equals(sc.nextLine()))
		    	return -1;
		    
		    uMan.setUser(new User(username, password));
		    sc.close();
		    
		    return 1;
		} catch(IOException e) {
			return -1;
		}
	}

	public boolean createUser(String username, String password)
	{
		try {
	 	     File file = new File(username);
	 	     
	 	     boolean fvar = file.createNewFile();
	 	     if(!fvar)
	 	    	 return fvar;
	 	     
	 	     FileWriter fWriter = new FileWriter(file);
	 	     PrintWriter pWriter = new PrintWriter(fWriter);
	 	     pWriter.println(password + "\n\n");
	 	     pWriter.close();
	 	     
	 	     return fvar;
	     	} catch (IOException e) {
	     		System.out.println("Exception Occurred:");
	 	        e.printStackTrace();
	     	}
		return false;
	}
	
	public void getGoal(String username, UserManager uMan)
	{
		try {
		    File inFile = new File(username);

		    Scanner sc = new Scanner (inFile);
		    sc.nextLine();
		    
		    System.out.println(sc.nextLine());
		    sc.close();
		    
		} catch(IOException e) {
			
		}
	}
	
	
}
