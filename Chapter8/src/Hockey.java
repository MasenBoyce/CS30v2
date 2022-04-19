/*
  
	Program: Hockey.java 				Last Date of this Revision: April 9, 2022 
	Purpose: The hockey class tests the puck class by asking the user to enter the weights of two pucks then telling them what division the pucks are for, if the pucks are equal in weight or not, as well as which puck is heavier.
	Author: Masen Boyce
	School: CHHS
	Course: Computer Science 30 
	
*/



import java.util.Scanner;



public class Hockey extends Puck //allows class to access information from the puck class
{
	
	public Hockey(double w) 
	{
		super(w);
	}
	
	
	
	public static void main(String[] args)  //tests the puck class
	{
		Scanner input = new Scanner(System.in); //allows for user input
		
		System.out.print("Enter a weight between 4 and 5.5 ounces: "); //prompts for puck weight
		double p1 = input.nextDouble(); //stores weight in double
		
		System.out.print("Enter a weight between 4 and 5.5 ounces: "); //prompts for puck weight
		double p2 = input.nextDouble(); //stores weight in double
		
		Puck P1 = new Puck(p1);
		Puck P2 = new Puck(p2);
		
		
		if(P1.equals(P2) == true) //tests if pucks are equal
		{
			System.out.println(P1.toString());
			System.out.println(P2.toString());
			System.out.println("The two pucks are equal in weight.");
		}
		
		else //if pucks are not equal
		{
			System.out.println(P1.toString());
			System.out.println(P2.toString());
			System.out.println("The two pucks are not equal in weight.");
		}
		
		
		
		if(P1.compareTo(P2) == 0) //compares puck weights through compareTo in the puck class 
		{
			System.out.println("Pucks are equal");
		}
		
		else if(P1.compareTo(P2) < 0) //if puck 2 is heavier 
		{
			System.out.println("Puck 1 is lighter than Puck 2.");
		}
		
		else //if puck 1 is heavier
		{
			System.out.println("Puck 1 is heavier than Puck 2");
		}	
	}
}


/*

Screen dump:


Enter a weight between 4 and 5.5 ounces: 4
Enter a weight between 4 and 5.5 ounces: 4
The weight of the puck is: 4.0 ounces, and the division is Puck is youth weight
The weight of the puck is: 4.0 ounces, and the division is Puck is youth weight
The two pucks are equal in weight.
Pucks are equal



Enter a weight between 4 and 5.5 ounces: 4
Enter a weight between 4 and 5.5 ounces: 5.5
The weight of the puck is: 4.0 ounces, and the division is Puck is youth weight
The weight of the puck is: 5.5 ounces, and the division is Puck is standard weight.
The two pucks are not equal in weight.
Puck 1 is lighter than Puck 2.



Enter a weight between 4 and 5.5 ounces: 5.5
Enter a weight between 4 and 5.5 ounces: 4
The weight of the puck is: 5.5 ounces, and the division is Puck is standard weight.
The weight of the puck is: 4.0 ounces, and the division is Puck is youth weight
The two pucks are not equal in weight.
Puck 1 is heavier than Puck 2

*/


