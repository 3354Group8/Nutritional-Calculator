import java.util.*;
import java.io.*;

public class Controller
{
	public static void main (String arg[])
	{
		String userID; 
		String userPW; 
		String iName;
		String iType;
		int dCalories;
		int gCalories;
		int calories;
		int selection = 0;
		
		Scanner userIn = new Scanner(System.in);
		ItemMng list= new ItemMng();
		Goal goal = new Goal();
		
		
		
		//get user name
		System.out.println("Welcome! Please enter your username: ");
		userID = userIn.nextLine();
		
		//get password
		System.out.println("Please enter your password: ");
		userPW = userIn.nextLine();
		
		User person = new User(userID, userPW);
		
		do 
		{
			System.out.println("Please select from the following options: \n");
			System.out.println("1. Add a new item.");
			System.out.println("2. Add a new goal.");
			System.out.println("3. Add daily goal.");
			System.out.println("4. Exit\n");
			
			selection = userIn.nextInt();
		
		
		
			switch (selection)
			{
			//add new item
			case 1:
			{
				System.out.print("Please enter the item name: ");
				iName = userIn.nextLine();
				System.out.println();
				System.out.print("Please enter the item type: ");
				iType= userIn.nextLine();
				System.out.print("Please enter the number of calories: ");
				calories= userIn.nextInt();
				
				Item food= new Item(iName, iType, calories);
				list.addItem(food);
				
				break;
			}
			//add new goal
			case 2:
			{
				System.out.println("Please enter your overall calories intake goal: ");
				gCalories=userIn.nextInt();
				goal.addGoal(gCalories);
				
				break;
			}
			//add daily goal
			case 3:
			{
				System.out.println("Please enter your daily calories intake: ");
				dCalories=userIn.nextInt();
				goal.addDailyGoal(dCalories);
				
				break;
			}
			//exit
			case 4:
			{
				System.out.println("Thanks for selecting Group8 Software ");
				System.exit(0);
				break;
			}
			default:
			{
				System.out.println("Incorrect selection");
			}
				
			}
		}
		while (selection !=4);
		
		
		
	}
}