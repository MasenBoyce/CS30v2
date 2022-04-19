
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



/*

Screen Dump:


Choose one of the following: Car (C) || Truck (T) || Minivan (MV) || Quit (Q)
C
The fuel economy of a car in the city is: 51 MPG
The fuel economy of a car on the highway is: 49 MPG
The number of seats in the car is 5
The trunk in this car can hold 4.0 bags of cargo
A typical car has higher MPG than most vehicles and can hold up to 5 people. However the higher MPG comes with a lack of storage space for large amounts of cargo with the trunk space usually being very limited.

Choose one of the following: Car (C) || Truck (T) || Minivan (MV) || Quit (Q)
T
The fuel economy of a truck in the city is: 23 MPG
The fuel economy of a truck on the highway is: 30 MPG
The number of seats in the truck is 4
The bed in this truck can hold 4.0 bags of cargo
This type of vehicle tends to have lower MPG than typical cars however they are more spacious and capable of carrying more cargo in the bed as well as provide more space in the cabin for passengers. They are also more capable with off-roading than other vehicles.

Choose one of the following: Car (C) || Truck (T) || Minivan (MV) || Quit (Q)
MV
The fuel economy of a minivan in the city is: 19 MPG
The fuel economy of a minivan on the highway is: 27 MPG
The number of seats in the minivan is 8
The trunk in this minivan can hold 5.0 bags of cargo
This type of vehicle is attuned to carrying many more passengers than a car or a truck capable of up to 8 peoople. The storage space is limited if the vehicle is at max person capacity however the seats in the back can be lowered to offer more room for cargo. This vehicle has lower MPG than a typical car or truck.


*/

