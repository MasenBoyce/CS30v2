package CarDealership;

public class Truck extends Vehicle 
{
	public Truck(int fECity, int fEHwy, int seating, double cargo) 
	{
		super(fECity, fEHwy, seating, cargo);
	}
	
	
	
	String FECity() 
	{
		return("The fuel economy of a truck in the city is: " + super.getFECity() + " MPG");
	}
	
	
	String FEHwy() 
	{
		return("The fuel economy of a truck on the highway is: " + super.getFEHwy() + " MPG");
	}
	
	
	
	String seating() 
	{
		return("The number of seats in the truck is " + super.getSeating());
	}
	
	
	String cargoContainer() 
	{
		return("The trunk in this truck can hold " + super.getCargoVolume() + " cubic feet of cargo");
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
