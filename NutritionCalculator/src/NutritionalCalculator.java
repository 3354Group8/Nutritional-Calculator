

public class NutritionalCalculator
{
	public static void main(String[] args) 
	{
		userCon = new UserController();
		goalCon = new GoalController();
		foodCon = new FoodController();
		system = new System(userCon, goalCon, foodCon);
		system.run();
	}
}