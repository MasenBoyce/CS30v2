package Vehicle;

public class Car extends Vehicle 
{
	public Car(int fECity, int fEHwy, int seating, double cargo) 
	{
		super(fECity, fEHwy, seating, cargo);
	}
	
	
	
	String FEHwy() 
	{
		return("The fuel economy on the highway is: " + super.getFEHwy() + " Miles / Gallon");
	}
	
	
	String FECity() 
	{
		return("The fuel economy in the city is: " + super.getFECity() + " Miles / Gallon");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	String cargoContainer() 
	{
		return("");
	}
	
	
	String description() 
	{
		return("");
	}
	
	
	
}
