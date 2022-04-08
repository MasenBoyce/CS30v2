package CarDealership;

public class Minivan extends Vehicle 
{
	public Minivan(int fECity, int fEHwy, int seating, double cargo) 
	{
		super(fECity, fEHwy, seating, cargo);
	}
	
	
	
	String FECity() 
	{
		return("The fuel economy of a minivan in the city is: " + super.getFECity() + " MPG");
	}
	
	
	String FEHwy() 
	{
		return("The fuel economy of a minivan on the highway is: " + super.getFEHwy() + " MPG");
	}
	
	
	
	String seating() 
	{
		return("The number of seats in the minivan is " + super.getSeating());
	}
	
	
	String cargoContainer() 
	{
		return("The trunk in this minivan can hold " + super.getCargoVolume() + " cubic feet of cargo");
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
