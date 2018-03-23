package view;
import java.util.Scanner;

import controller.*;

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
		String loginViewText = 
				  "================================= \n"
				+ "= Nutritional Calculator        = \n"
				+ "================================= \n"
				+ "= A - Calculate                 = \n"
				+ "= B - Add Item                  = \n"
				+ "= C - Delete Item               = \n"
				+ "= D - " + (goalCon.hasGoal() ? "Edit Goal" : "Add Goal ") + "                    = \n"
				+ "= E - Save Current              = \n"
				+ "= F - Load Old                  = \n"
				+ "= G - Logout                    = \n"
				+ "= H - Exit                      = \n"
				+ "================================= \n"
				+ "  ? - ";
			System.out.print(loginViewText);
			String input = in.nextLine();
			
			switch(input)
			{/*
			case "A": 	return view();
			case "B":	return addItem();
			case "C":	return deleteItem;
			case "D":	return (goalCon.hasGoal() ? editGoal() : addGoal());*/
			case "E":	return save();
			case "F":	return load();
			case "G":	return logout();
			case "H":	return State.EXIT;
			default: 	System.out.println("\n Invalid Input"); 
						return State.USER;
			}
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
