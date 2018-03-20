package edu.utd.nutritioncalc.managers;

import java.util.Date;
import edu.utd.nutritioncalc.domain.Goal;
import edu.utd.nutritioncalc.domain.User;
import edu.utd.nutritioncalc.Constants;

public class Calculator {
	
	public int calculateDailyCalories(Goal goal, User user){
		int weightDiff = goal.getGoalFinishWeight() - goal.getGoalBeginWeight();
		int numberOfDays = getDaysDiff(goal.getGoalBeginDate(), goal.getGoalFinishDate());
		double changePerDay = weightDiff/numberOfDays;
		int caloriesPerDay = (int)changePerDay*160;
		
		long ageInMillis = System.currentTimeMillis() - user.getDob().getTime();
		int age = (int)ageInMillis/(1000 * 60 * 60 * 24 * 365);
		int caloriesToMaintain = (int)calculateCalories(user.getGender(), user.getHeight(), goal.getGoalBeginWeight(), age);
		return caloriesToMaintain + caloriesPerDay;
	}
	
	public double calculateCalories(int gender, int height, int weight, int age){
		double calories = 0;
		//MEN : 66.4730 + (13.7516 x weight in kg) + (5.0033 x height in cm) – (6.7550 x age in years)
		//WOMEN: 655.0955 + (9.5634 x weight in kg) + (1.8496 x height in cm) – (4.6756 x age in years)
		if(gender == Constants.MALE){
			calories = 66.4730 + (13.7516 * weight) + (5.0033 * height) - (6.7550 * age);
		}else{
			calories =  655.0955 + (9.5634 * weight) + (1.8496 * height) - (4.6756 * age);
		}
		return calories;
	}
	
	public int calculateBMI(int height, int weight){
		int bmi = weight/height*height;
		return bmi;
	}

	private int getDaysDiff(Date start, Date end){
		long timeMillis = end.getTime() - start.getTime();
		int days = (int)timeMillis/(1000 * 60 * 60 * 24);
		return days;
	}
}
