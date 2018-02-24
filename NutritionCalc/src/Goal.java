
public class goal
{
	private int caloriesGoal;
	private int dailyCalories;
	
	public goal()
	{
		caloriesGoal=0;
		dailyCalories=0;
	}
	public void addGoal(int caloriesGoal)
	{
		this.caloriesGoal=caloriesGoal;
	}
	public void addDailyGoal(int dailyCalories)
	{
		this.dailyCalories=dailyCalories;
	}
	public int getCaloriesGoal()
	{
		return caloriesGoal;
	}
	public int getDailyGoal()
	{
		return dailyCalories;
	}
}
