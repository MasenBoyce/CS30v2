/*

	Program: Minivan.java          Last Date of this Revision: April 11, 2022
	Purpose: This class stores all the given information about the minivan and returns it in a text sequence as well as provided a description of the vehicle.
	Author: Masen Boyce 
	School: CHHS
	Course: Computer Science 30
 
*/

package CarDealership;

public class Minivan extends Vehicle 
{
	public Minivan(int fECity, int fEHwy, int seating, double cargo) //constructor 
	{
		super(fECity, fEHwy, seating, cargo);
	}
	
	
	
	String FECity() //returns the city MPG of the minivan 
	{
		return("The fuel economy of a minivan in the city is: " + super.getFECity() + " MPG");
	}
	
	
	String FEHwy() //returns the highway MPG of the minivan
	{
		return("The fuel economy of a minivan on the highway is: " + super.getFEHwy() + " MPG");
	}
	
	
	
	String seating() //returns the number of seats in the minivan 
	{
		return("The number of seats in the minivan is " + super.getSeating());
	}
	
	
	String cargoContainer() //returns the amount of cargo the minivan can hold
	{
		return("The trunk in this minivan can hold " + super.getCargoVolume() + " bags of cargo");
	}
	
	
	String description() //briefly describes the traits of a typical minivan
	{
		return("This type of vehicle is attuned to carrying many more passengers than a car or a truck capable of up to 8 peoople. The storage space is limited if the vehicle is at max person capacity however the seats in the back can be lowered to offer more room for cargo. This vehicle has lower MPG than a typical car or truck.");
	}
	
	
	
	public String toString() //returns all the above string sequences when called upon 
	{
		return(FECity() + "\n" + FEHwy() + "\n" + seating() + "\n" + cargoContainer() + "\n" + description());
	}
}
