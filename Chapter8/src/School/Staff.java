/*

	Program: Staff.java          Last Date of this Revision: April 11, 2022
	Purpose: This program prompts staff members to enter details about their position and stores it. The program also returns given information when called upon.
	Author: Masen Boyce 
	School: CHHS
	Course: Computer Science 30
 
*/

package School;
public class Staff extends UEmployee 
{
	private String Job;
	
	
	
	public Staff(String Fname, String Lname, String J, double PR) //constructor class (creates staff employee) 
	{
		super(Fname, Lname, PR);
		Job = J;
	}

	
	
	public String toString() //returns the given information when called upon in the form of a text string. 
	{
		return(super.toString() + "\nStaff Job Title: " + Job);
	}
}

