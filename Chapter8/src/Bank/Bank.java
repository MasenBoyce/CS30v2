/*
 
 	Program: Bank.java 				Last Date of this Revision: April 9, 2022 

	Purpose: This class tests Account, BusinessAcct, Customer, and PersonalAcct by prompting a user to enter their information and pick either a business or personal account and will charge them based on their account type and account balance.
	Author: Masen Boyce
	School: CHHS
	Course: Computer Science 30 
	
*/ 


package Bank;

import java.util.Scanner;



public class Bank extends Account //allows access to variable from account class 
{
	
	public Bank(double bal, String fName, String lName, String str, String city, String st, String zip) { //
	
	super(bal, fName, lName, str, city, st, zip); //initializes with parameters
	
	
	
	}

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //allows for user input
		String action;
		
		
		
		do { //prompts user to enter their information for their account as well as choose an account type (business or personal)
			
		System.out.println("First Name: ");
		String FN = input.nextLine();
		
		System.out.println("Last Name: ");
		String LN = input.nextLine();
		
		System.out.println("Street: ");
		String str = input.nextLine();
		
		System.out.println("City: ");
		String C = input.nextLine();
		
		System.out.println("State: ");
		String S = input.nextLine();
		
		System.out.println("Zip: ");
		String Z = input.nextLine();
		
		
		
		Customer Cust = new Customer(FN, LN, str, C, S, Z);
		
		
		
		System.out.println("Personal Account (P) || Business Account (B) || Quit (Q)");
		action = input.nextLine();
		
		
		
		if(action.equalsIgnoreCase("Personal Account") || action.equalsIgnoreCase("P")) 
		{
			System.out.println("Please enter account balance: ");
			double bal = input.nextDouble();
			
	
			
			if(bal < 100) //charges user for having an account balance below the minimum 
			{
				bal = bal - 2;
				
				System.out.println("Balance fell below $100, $2 was charged to account");
			}
			
			
			
			Account PA = new PersonalAcct(bal, FN, LN, str, C, S, Z);
			System.out.println(Cust.toString() + PA.toString());
			
		}
		
		
		
		if(action.equalsIgnoreCase("Business Account") || action.equalsIgnoreCase("B")) 
		{
			System.out.println("Please enter an account balance: ");
			double bal = input.nextDouble();
			
			
			if(bal < 500) //charges user for having an account balance below the minimum 
			{
				bal = bal - 10;
				
				System.out.println("Balance fell below $500, $10 was charged to account");
			}
			
			
			
			Account BA = new BusinessAcct(bal, FN, LN, str, C, S, Z);
			System.out.println(Cust.toString() + BA.toString());
			
		}
		}
		
		
		
		while(action.equalsIgnoreCase("Q") || (action.equalsIgnoreCase("Quit"))); //keep running program until user selects the quit option
	}
	
}



/*
 
Screen dump:

First Name: 
Masen
Last Name: 
Boyce
Street: 
A
City: 
B
State: 
C
Zip: 
1234
Personal Account (P) || Business Account (B) || Quit (Q)
P
Please enter account balance: 
750
Masen Boyce
A
B, C  1234
Balance: $750.0


First Name: 
Masen
Last Name: 
Boyce
Street: 
A
City: 
B
State: 
C
Zip: 
1234
Personal Account (P) || Business Account (B) || Quit (Q)
B
Please enter an account balance: 
450
Balance fell below $500, $10 was charged to account
Masen Boyce
A
B, C  1234
Balance: $440.0

