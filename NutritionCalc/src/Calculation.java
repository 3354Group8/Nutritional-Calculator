
public class Calculation 
{
	private int calories;
	private int dailyCalories;
	private Goal cal;
	private Item iCal;
	
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
