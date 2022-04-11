/*

	Program: University.java          Last Date of this Revision: April 11, 2022
	Purpose: This program tests the faculty, staff, and UEmployee classes by prompting the user to enter the information about their position in the university including name, job title, and salary.
	Author: Masen Boyce 
	School: CHHS
	Course: Computer Science 30
 
*/

package School;

import java.util.Scanner;



public class University 
{


	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //allows for user input
		String action;
		
		
		
		do 
		{
			
		System.out.println("Branch: Faculty (F) | Staff (S) | Quit (Q)"); //prompts user to select a branch or quit
		action = input.nextLine();
		
		
	
		if(action.equalsIgnoreCase("F") || action.equalsIgnoreCase("Faculty")) //if the user is a member of the faculty branch it will prompt them to enter their name, pay rate, and deparment then will return the given information.
		{
			System.out.println("Department: ");
			String D = input.nextLine();
			
			System.out.println("Hourly Pay Rate: ");
			double PR = input.nextDouble();
			
			System.out.println("First Name: ");
			String FN = input.nextLine();
			
			System.out.println("Last Name: ");
			String LN = input.nextLine();
			
			
			Faculty emp = new Faculty(FN, LN, D, PR);
			
			
			System.out.println(emp.toString());
		}
		
		
		
		if(action.equalsIgnoreCase("S") || action.equalsIgnoreCase("Staff")) //if the user is a staff member it will prompt them to enter information about their position as well as their name and will return the given information to the user.
		{
			System.out.println("Job title: ");
			String JT = input.nextLine();
			
			System.out.println("Salary: ");
			double S = input.nextDouble();
			
			System.out.println("First Name: ");
			String FN = input.nextLine();
			
			System.out.println("Last Name: ");
			String LN = input.nextLine();
			
			
			Staff emp = new Staff(FN, LN, JT, S);
			
			
			System.out.println(emp.toString());
			
		}
		}
		
		
	
		while(action.equalsIgnoreCase("Q") || (action.equalsIgnoreCase("Quit"))); //restarts the program from the beginning if the user chooses to quit.
	}
}




