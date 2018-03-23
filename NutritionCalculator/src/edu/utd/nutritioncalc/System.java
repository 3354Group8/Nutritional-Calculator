package edu.utd.nutritioncalc;

public class System
{
	UserController userCon; 
	GoalController goalCon; 
	FoodController foodCon;

	public System(UserController in_userCon, 
		GoalController in_goalCon, 
		FoodController in_foodCon)
	{
		userCon = in_userCon;
		goalCon = in_goalCon;
		foodCon = in_foodCon;
	}
}