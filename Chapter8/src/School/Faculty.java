/*

	Program: Faculty.java          Last Date of this Revision: April 11, 2022
	Purpose: This program stores the information of faculty staff and returns the given information when called upon. 
	Author: Masen Boyce 
	School: CHHS
	Course: Computer Science 30
 
*/

package School;
public class Faculty extends UEmployee
{
	private String Department;

		
	
	
	public Faculty(String Fname, String Lname, String D, double PR) //constructor (generates an employee) 
	{
		super(Fname, Lname, PR);
		Department = D;

		
	}
	
	
	
	public String toString() //returns given information when called upon in the form of a text string.
	{
		return(super.toString() + "\nFaculty Department: " + Department);
	}
}

