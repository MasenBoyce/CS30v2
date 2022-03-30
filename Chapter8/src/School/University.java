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
		
		System.out.println("First Name: ");
		String FN = input.nextLine();
		
		System.out.println("Last Name: ");
		String LN = input.nextLine();
		
		
		
		if(action.equalsIgnoreCase("F") || action.equalsIgnoreCase("Faculty")) 
		{
			System.out.println("Department: ");
			String D = input.nextLine();
			
			System.out.println("Hourly Pay Rate: ");
			double HPR = input.nextDouble();
			
			Faculty emp = new Faculty(FN,LN,D,HPR);
		}
		
		
		
		if(action.equalsIgnoreCase("S") || action.equalsIgnoreCase("Staff")) 
		{
			System.out.println("Job title: ");
			String JT = input.nextLine();
			
			System.out.println("Salary: ");
			String S = input.nextLine();
		}
		}
		
		
	
		while(!action.equalsIgnoreCase("Q"));
	}
}




