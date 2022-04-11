/*

	Program: UEmployee.java          Last Date of this Revision: April 11, 2022
	Purpose: This class stores the users name and pay rate and returns is when called upon. 
	Author: Masen Boyce 
	School: CHHS
	Course: Computer Science 30
 
*/

package School;
abstract class UEmployee 
{
	private String FN, LN;
	private double PayRate;
	
	
	
	
	public UEmployee(String Fname, String Lname, double PR) //constructor class (creates an employee)
	{	
		FN = Fname;
		LN = Lname;
		PayRate = PR;
		
	}
	
	
	
	public String toString() //returns employees name and pay rate
	{
		return("Employee name: " + FN + " " + LN + "\nSalary: $" + PayRate);
	}
}
