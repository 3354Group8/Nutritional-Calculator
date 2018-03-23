package view;
import java.util.Scanner;

import edu.utd.controller.*;

public class UserView 
{
	private UserController userCon;
	private FoodController foodCon;
	private GoalController goalCon;
	private Scanner in;
	
	UserView(UserController in_userCon, 
		FoodController in_foodCon, 
		GoalController in_goalCon)
	{
		userCon = in_userCon;
		foodCon = in_foodCon;
		goalCon = in_goalCon;
		in = new Scanner(System.in);
	}
	
	State run()
	{
		String userViewText = 
				  "================================= \n"
				+ "= Nutritional Calculator        = \n"
				+ "================================= \n"
				+ "= A - Calculate                 = \n"
				+ "= B - Add Entry                 = \n"
				+ "= C - Delete Entry              = \n"
				+ "= D - " + (goalCon.hasGoal() ? "Edit Goal" : "Add Goal ") + "                 = \n"
				+ "= E - Save Current              = \n"
				+ "= F - Load Old                  = \n"
				+ "= G - Logout                    = \n"
				+ "= H - Exit                      = \n"
				+ "================================= \n"
				+ "  ? - ";
			System.out.print(userViewText);
			String input = in.nextLine();
			
			switch(input)
			{
			case "A": 	return view();
			case "B":	return addEntry();
			case "C":	return deleteEntry();
			case "D":	return editGoal();
			case "E":	return save();
			case "F":	return load();
			case "G":	return logout();
			case "H":	return State.EXIT;
			default: 	System.out.println("\n Invalid Input"); 
						return State.USER;
			}
	}

	private State view()
	{
		userCon.view();
		return State.USER;
	}
	
	private State addEntry()
	{
		userCon.loadUser();
		return State.USER;
	}
	
	private State deleteEntry()
	{
		
		return State.LOGIN;
	}

	private State editGoal()
	{
		
		return State.LOGIN;
	}
	
	private State save()
	{
		userCon.saveUser();
		return State.USER;
	}
	
	private State load()
	{
		userCon.loadUser();
		return State.USER;
	}
	private State logout()
	{
		
		return State.LOGIN;
	}
}
