/*
 
	Program: BusinessAcct.java 				Last Date of this Revision: April 9, 2022 
	Purpose: This class stores the users information if they choose a business class and returns the account balance.
	Author: Masen Boyce
	School: CHHS
	Course: Computer Science 30
	 
*/

package Bank;
public class BusinessAcct extends Account 
{
	private double Bal;
	
	
	
	public BusinessAcct(double bal, String fName, String lName, String str, String city, String st, String zip) //constructor
	{
		super(bal, fName, lName, str, city, st, zip);
		
		Bal = bal;
	}
	
	
	
	public String toString() //returns data of the constructor
	{
		return("Balance: $" + Bal);
	}
}
