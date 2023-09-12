/*
   Author: Savaas Iqbal
   Date: 10/2/2022
   Purpose: This program demonstrates how numeric types and operators behave in Java
*/

//TASK #2  Add import statement here to use the Scanner class
import java.util.Scanner;
//TASK #2  (Alternate) Add import statment to use JOptionPane class

public class NumericTypes
{
	public static void main (String [] args)
	{
		//TASK #2 Create a Scanner object here (not used for alternate)
	   Scanner keyboard = new Scanner(System.in); 
		//identifier declarations
		final float NUMBER = 2 ;		// number of scores
		final float SCORE1 = 100;		// first test score
		final float SCORE2 = 95;		// second test score
		final float BOILING_IN_F = 212;  // freezing temperature
		float fToC;						// temperature in celsius
		float average;				// arithmetic average
		String output;					// line of output to print out
		//TASK #2 declare variables used here
		//TASK #3 declare variables used here
		//TASK #4 declare variables used here

		// Find an arithmetic average
		average = (SCORE1 + SCORE2) / NUMBER;
		output = SCORE1 + " and " + SCORE2 + " have an average of "
				+ average;
		System.out.println(output);

		// Convert Fahrenheit temperatures to Celsius
		fToC = (BOILING_IN_F - 32) * 5/9 ;
		output = BOILING_IN_F + " in Fahrenheit is " + fToC
			     + " in Celsius.";
		System.out.println(output);
		System.out.println();		// to leave a blank line

		// ADD LINES FOR TASK #2 HERE
		// prompt the user for first name
      System.out.println("Enter your first name"); 
		// read the user's first name
      String firstName = keyboard.nextLine(); 
		// prompt the user for last name
      System.out.println("Enter your last name");
		// read the user's last name
      String lastName = keyboard.nextLine();
		// concatenate the user's first and last names
      String fullName = firstName + " " + lastName; 
		// print out the user's full name 
      System.out.println("My full name is " + fullName); 
		System.out.println();		// to leave a blank line
		
		// ADD LINES FOR TASK #3 HERE
		// get the first character from the user's first name
      char firstInitial = firstName.charAt(0); 
		// print out the user's first initial
      System.out.println("My first initial is " + firstInitial); 
		// convert the user's full name to all capital letters
      fullName = fullName.toUpperCase();
		// print out the user's full name in all capital letters
      System.out.println(fullName + " contains " + fullName.length() + " characters."); 
		System.out.println();		// to leave a blank line
		
		// ADD LINES FOR TASK #4 HERE
		// prompt the user for a diameter of a sphere
      System.out.println("Enter the diameter of the sphere");
		// read the diameter
      double diameter = keyboard.nextDouble();
		// calculate the radius
      double radius = diameter / 2; 
		// calculate the volume 
      double volume = 4 / 3.0 * Math.PI * Math.pow(radius, 3); 
		// print out the volume
      System.out.println("The volume of the sphere " + volume); 
	}	
}

/*output
    100.0 and 95.0 have an average of 97.5
 212.0 in Fahrenheit is 100.0 in Celsius.
 
 Enter your first name
 Shariqa
 Enter your last name
 Iqbal
 My full name is Shariqa Iqbal
 
 My first initial is S
 SHARIQA IQBAL contains 13 characters.
 
 Enter the diameter of the sphere
 2
 The volume of the sphere 4.1887902047863905

*/

/* Link to google doc with table calculations for volume of sphere from diameter
https://docs.google.com/document/d/1l-TQXTqBz-NW539hRGEdTSizqPcHwyYkIw3pVZFcs-U/edit?usp=sharing
*/