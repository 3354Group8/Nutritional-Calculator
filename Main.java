import java.util.*;
import java.io.*;

//So far, I've written Main to create a user and create an item. It
//calls on only user.java and item.java, while goal.java and
//calculation.java remain unincorporated.
public class Main
{
  public static void main(String args[]){
    public String userID = new String();
    public String userPW = new String();
    public int selection = 0;
    public Scanner userIn = new Scanner(System.in);

    // Getting a username from the new user.
    System.out.println("Welcome! Please enter your username: ");
    userID = userIn.nextString();

    //Getting password from the new user.
    System.out.println("Please enter your password: ");
    userPW = userIn.nextString();

    // The user is created using the above criteria.
    user(userID, userPW);

    //The user adds items by name.
    while(selection < 0 || selection > 1){
      System.out.println("Please select from the following options:\n");
      System.out.println("\t1. Add a new item.\n");
      System.out.println("\t0. Exit.\n")
      selection = userIn.nextInt();

      //Evaluate validity of input.
      if(selection < 0 || selection > 1){
        System.out.println("The selection that you made is invalid.\n");
        System.out.println("Please try again.\n\n");
      }
    }

    //Add item.
    if(selection == 1){
      public String itemName = new String();
      public String itemType = new String();
      public int calories;

      System.out.println("Please enter the name of the item: \n");
      itemName = userIn.nextString();

      System.out.println("Please enter the item type: \n");
      itemType = userIn.nextString();

      System.out.println("Please enter the number of calories: \n");
      calories = userIn.nextInt();

      //Create the item.
      additem(itemName, itemType, calories);
    }

    //Closing message.
    System.out.println("Thank you for choosing Group8 Software.");
  }
}
