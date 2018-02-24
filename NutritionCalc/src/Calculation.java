
public class calculation 
{
	private int calories;
	private int dailyCalories;
	private goal cal;
	private item iCal;
	
	public int dailyCalc()
	{
		calories= cal.getCaloriesGoal() - iCal.getCalories();
		return calories;
	}
	public int caloriesCalc()
	{
		calories=cal.getDailyGoal()-iCal.getCalories();
		return calories;
	}
}
