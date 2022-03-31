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
			
		System.out.println("Branch: Faculty (F) | Staff (S) | Quit (Q)");
		action = input.nextLine();
		
		
	
		if(action.equalsIgnoreCase("F") || action.equalsIgnoreCase("Faculty")) 
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
		
		
		
		if(action.equalsIgnoreCase("S") || action.equalsIgnoreCase("Staff")) 
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
		
		
	
		while(action.equalsIgnoreCase("Q") || (action.equalsIgnoreCase("Quit")));
	}
}




