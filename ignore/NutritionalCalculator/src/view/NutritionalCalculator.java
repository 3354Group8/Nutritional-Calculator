package view;

import controller.*;
import model.DatabaseManager;
import model.UserManager;

enum State {
	LOGIN, USER, EXIT
}

public class NutritionalCalculator
{
	private FoodController foodCon;
	private UserController userCon;
	private GoalController goalCon;
	private DatabaseManager dbMan;
	private UserManager uMan;
	
	private State state;
	
	NutritionalCalculator()
	{
		dbMan = new DatabaseManager();
		uMan = new UserManager();
		foodCon = new FoodController(dbMan, uMan);
		userCon = new UserController(dbMan, uMan);
		goalCon = new GoalController(dbMan, uMan);
		state = State.LOGIN;
	}
	
	void run() 
	{
		while(state != State.EXIT) 
		{
			switch(state) {
				case LOGIN: LoginView loginView = new LoginView(userCon);
							state = loginView.run(); 
							break;
				case USER: 	UserView userView = new UserView(userCon, foodCon, goalCon);
							state = userView.run(); 
							break;
				default: 	break;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		NutritionalCalculator system = new NutritionalCalculator();
		system.run();
	}
}