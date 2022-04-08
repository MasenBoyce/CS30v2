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
			System.out.println("Choose one of the following: Car (C) || Truck (T) || Minivan (MV) || Quit (Q)");
			action = input.nextLine();
			
			
			
			if(action.equalsIgnoreCase("Car") || action.equalsIgnoreCase("C")) 
			{
				Car C = new Car(51, 49, 5, 4);
				
				System.out.println(C.toString());
			}
			
			
			if(action.equalsIgnoreCase("Truck") || action.equalsIgnoreCase("T")) 
			{
				Truck T = new Truck(23, 30, 4, 4);
				
				System.out.println(T.toString());
			}
			
			
			if(action.equalsIgnoreCase("Minivan") || action.equalsIgnoreCase("MV")) 
			{
				Minivan MV = new Minivan();
			}
		}
	}
}
