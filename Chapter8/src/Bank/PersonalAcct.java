/*
 
	Program: PersonalAcct.java 				Last Date of this Revision: April 9, 2022 
	Purpose: This class stores the users information if the choose a personal account and returns the balance of the account.
	Author: Masen Boyce
	School: CHHS
	Course: Computer Science 30
	 
*/

package Bank;
public class PersonalAcct extends Account 
{
	private double Bal;
	
	
	
	public PersonalAcct(double bal, String fName, String lName, String str, String city, String st, String zip) //allows access to these variables from o
	{
		super(bal, fName, lName, str, city, st, zip); //An account has been created. Balance and customer data has been initialized with parameters.
		
		Bal = bal;
	}
	
	
	
	public String toString() 
	{
		return("Balance: $" + Bal);
	}
}
