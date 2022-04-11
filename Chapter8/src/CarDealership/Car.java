/*

	Program: Car.java          Last Date of this Revision: April 11, 2022
	Purpose: This class stores the given information about the car and returns it in the text sequence as well as provides a description of the vehicle.
	Author: Masen Boyce 
	School: CHHS
	Course: Computer Science 30
 
*/

package CarDealership;

public class Car extends Vehicle 
{
	public Car(int fECity, int fEHwy, int seating, double cargo) //constructor 
	{
		super(fECity, fEHwy, seating, cargo);
	}
	
	
	
	String FECity() //returns the city MPG of the car
	{
		return("The fuel economy of a car in the city is: " + super.getFECity() + " MPG");
	}
	
	
	String FEHwy() //returns the highway MPG of the car 
	{
		return("The fuel economy of a car on the highway is: " + super.getFEHwy() + " MPG");
	}
	
	
	
	String seating() //returns the number of seats in the car 
	{
		return("The number of seats in the car is " + super.getSeating());
	}
	
	
	String cargoContainer() //returns the amount of cargo the car can hold
	{
		return("The trunk in this car can hold " + super.getCargoVolume() + " bags of cargo");
	}
	
	
	String description() //returns a description of the car. 
	{
		return("A typical car has higher MPG than most vehicles and can hold up to 5 people. However the higher MPG comes with a lack of storage space for large amounts of cargo with the trunk space usually being very limited.");
	}
	
	
	
	public String toString() //returns all the above text sequences when called upon
	{
		return(FECity() + "\n" + FEHwy() + "\n" + seating() + "\n" + cargoContainer() + "\n" + description());
	}
	
	
	
}
