
/*
 
 	Program: Puck.java 				Last Date of this Revision: April 9, 2022 
	Purpose: This class tests the weight of 
	Author: Masen Boyce
	School: CHHS
	Course: Computer Science 30 
	
*/ 
	
	
	
public class Puck 
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
		
		
		return(div); //returns result
	}
	
	
	
	public String toString() //prints the data of the puck
	
	{
		String puck;
		puck = ("The weight of the puck is: " + getWeight() + " ounces, and the division is " + getDivision());
		
		return(puck);
	}
	
	
	
	public boolean equals(Object p) //determines what devision the puck is in
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
	
	
	
	public int compareTo(Object c) //tests which puck is heavier or if they're equal in weight
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

