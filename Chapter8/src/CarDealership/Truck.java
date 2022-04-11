/*

	Program: Truck.java          Last Date of this Revision: April 11, 2022
	Purpose: This program stores received information about a truck and returns it to the user in the form of a text sequence.
	Author: Masen Boyce 
	School: CHHS
	Course: Computer Science 30
 
*/

package CarDealership;

public class Truck extends Vehicle 
{
	public Truck(int fECity, int fEHwy, int seating, double cargo) //constructor 
	{
		super(fECity, fEHwy, seating, cargo);
	}
	
	
	
	String FECity() //returns the city fuel economy of the truck when called upon.
	{
		return("The fuel economy of a truck in the city is: " + super.getFECity() + " MPG");
	}
	
	
	String FEHwy() //returns the highway fuel economy of the truck when called upon.
	{
		return("The fuel economy of a truck on the highway is: " + super.getFEHwy() + " MPG");
	}
	
	
	
	String seating() //returns the number of seats in the truck.
	{
		return("The number of seats in the truck is " + super.getSeating());
	}
	
	
	String cargoContainer() //returns the number of bags the bed of the truck can hold 
	{
		return("The bed in this truck can hold " + super.getCargoVolume() + " bags of cargo");
	}
	
	
	String description() //gives a description about the vehicle
	{
		return("This type of vehicle tends to have lower MPG than typical cars however they are more spacious and capable of carrying more cargo in the bed as well as provide more space in the cabin for passengers. They are also more capable with off-roading than other vehicles.");
	}
	
	
	
	public String toString() //returns all the above string sequences when called upon
	{
		return(FECity() + "\n" + FEHwy() + "\n" + seating() + "\n" + cargoContainer() + "\n" + description());
	}
}
