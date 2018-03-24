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
		    String line = sc.nextLine();
		    
		    String[] goalTokens = line.split(" ");
		    uMan.setGoal(new Goal(Integer.parseInt(goalTokens[0]), Integer.parseInt(goalTokens[1])));
		    
		    line = sc.nextLine();
		    String[] entryTokens = line.split(" ");
		    ArrayList<FoodEntry> foodEntries = new ArrayList<FoodEntry>();
		    int i; int j = 1;
		    for(i = 0; i < entryTokens.length; i+=2)
		    {
		    	foodEntries.add(new FoodEntry(entryTokens[i]), entryTokens[j]);
		    	j+=2;
		    }
		    uMan.setEntries(foodEntries);
		    
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
	
	
}
