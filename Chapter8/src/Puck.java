
public class Puck extends Disk 
{
	private double weight; //initializes weight
	private boolean standard, youth; //initializes standard and youth divisions
	
	

	public Puck(double w) //generates puck application 
	{
	
		weight  = w; //attaches weight to a public double w
		
		
		if(weight >= 5 && weight <= 5.5) //classifies a standard weight puck
		{
			standard = true;
		}
		
		else if(weight >= 4 && weight <= 4.5) //classifies a youth weight puck 
		{
			standard = false;
		}
	}
	
	
	
	public double getWeight() //outputs weight double 
	{
		return(weight);
	}
	
	
	
	public String getDivision() //generates and returns the division of puck
	{
		
		String div;
		
		
		if(standard) //displays that the puck is standard weight
		{
			div = "Puck is standard weight.";
		}
		
		else //displays that the puck is youth weight
		{
			div = "Puck is youth weight";
		}
		
		
		return(div);
	}
	
	
	
	public String toString() 
	
	{
		String puck;
		puck = ("The weight of the puck is: " + getWeight() + " ounces, and the division is " + getDivision());
		
		return(puck);
	}
	
	
	
	public boolean equals(Object p) 
	{
		Puck disk = (Puck)p;
		
		if(disk.getDivision() == getDivision()) 
		{
			return(true);
		}
		
		else 
		{
			return(false);
		}
	}
	
	
	
	public int compareTo(Object c) 
	{
		Puck object = (Puck)c;
		
		if(weight < object.getWeight()) 
		{
			return(-1);
		}
		
		else if (weight == object.getWeight()) 
		{
			return(0);
		}
		
		else 
		{
			return(1);
		}
	}
}