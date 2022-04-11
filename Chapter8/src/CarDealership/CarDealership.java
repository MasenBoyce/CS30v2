/*

	Program: CarDealership.java          Last Date of this Revision: April 11, 2022
	Purpose: This program tests the car, truck, minvan, and vehicle classes by prompting the user to select a vehicle and return information about the vehicle.
	Author: Masen Boyce 
	School: CHHS
	Course: Computer Science 30
 
*/

package CarDealership;
/* 
  
	Program: CarDealership.java				Last Date of this Revision: April 7, 2022 
	Purpose: This program tests the vehicle, car, truck and minivan classes by asking the user to select a car, truck, or minivan then returns the details of the selected vehicle.
	Author: Masen Boyce
	School: CHHS
	Course: Computer Science 30
 
 
 
 
 
 
	Sources:
	
	
	
	Fuel economies: https://www.fueleconomy.gov/feg/findacar.shtml
	
	
	Specs of vehicles: https://www.kayak.com/c/car-rental-guide/car-types/#:~:text=Intermediate%20vehicles%2C%20or%20midsize%20vehicles,and%20fit%203%2D4%20suitcases.
*/


import java.util.Scanner;



public class CarDealership 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //allows for user input
		String action;
		
		
		
		do 
		{
			System.out.println("Choose one of the following: Car (C) || Truck (T) || Minivan (MV) || Quit (Q)"); //prompts user to select a vehicle type or quit the program
			action = input.nextLine();
			
			
			
			if(action.equalsIgnoreCase("Car") || action.equalsIgnoreCase("C")) //returns information about a standard car if selected
			{
				Car C = new Car(51, 49, 5, 4); //constructor
				
				System.out.println(C.toString());
			}
			
			
			if(action.equalsIgnoreCase("Truck") || action.equalsIgnoreCase("T")) //returns information about a standard truck if selected
			{
				Truck T = new Truck(23, 30, 4, 4); //constructor
				
				System.out.println(T.toString());
			}
			
			
			if(action.equalsIgnoreCase("Minivan") || action.equalsIgnoreCase("MV")) //returns information about a standard minivan if selected
			{
				Minivan MV = new Minivan(19, 27, 8, 5); //constructor
				
				System.out.println(MV.toString());
			}
		}
		
		while(action.equalsIgnoreCase("Quit") || action.equalsIgnoreCase("Q")); //restarts program if user selects quit
		
	}
}

