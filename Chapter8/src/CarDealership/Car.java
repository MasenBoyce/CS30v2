package CarDealership;

public class Car extends Vehicle 
{
	public Car(int fECity, int fEHwy, int seating, double cargo) 
	{
		super(fECity, fEHwy, seating, cargo);
	}
	
	
	
	String FECity() 
	{
		return("The fuel economy of a car in the city is: " + super.getFECity() + " MPG");
	}
	
	
	String FEHwy() 
	{
		return("The fuel economy of a car on the highway is: " + super.getFEHwy() + " MPG");
	}
	
	
	
	String seating() 
	{
		return("The number of seats in the car is " + super.getSeating());
	}
	
	
	String cargoContainer() 
	{
		return("The trunk in this car can hold " + super.getCargoVolume() + " cubic feet of cargo");
	}
	
	
	String description() 
	{
		return("");
	}
	
	
	
	public String toString() 
	{
		return(FECity() + "\n" + FEHwy() + "\n" + seating() + "\n" + cargoContainer() + "\n" + description());
	}
	
	
	
}
