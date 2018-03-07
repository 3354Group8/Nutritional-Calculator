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
			System.out.println("2. Calculate Calories intake");
			System.out.println("3. Exit\n");
			
			selection = userIn.nextInt();
		
		
		
			switch (selection)
			{
			//add new item
			case 1:
			{
				System.out.print("Please enter the item name: ");
				iName = userIn.nextLine();
				userIn.nextLine();
				System.out.print("Please enter the item type: ");
				iType= userIn.nextLine();
				System.out.print("Please enter the number of calories: ");
				calories= userIn.nextInt();
				
				Item food= new Item(iName, iType, calories);
				list.addItem(food);
				
				break;
			}
			//calculate calories in take
			case 2:
			{
				System.out.println("An average daily calories for men are 2500.");
				System.out.println("An average daily calories for women are 2000");
				System.out.println("Your total Calories: "+ list.getTotalCalories()+"\n");
				
				break;
			}
			//exit
			case 3:
			{
				System.out.println("Thanks for using Group8 Software");
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