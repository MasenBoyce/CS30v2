package Bank;

import java.util.Scanner;



public class Bank extends Account 
{
	
	public Bank(double bal, String fName, String lName, String str, String city, String st, String zip) {
	
	super(bal, fName, lName, str, city, st, zip);
	
	
	
	}

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); //allows for user input
		String action;
		
		
		
		do {
			
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
			
	
			
			if(bal < 100) 
			{
				bal = bal - 2;
				
				System.out.println("Balance fell below $100, $2 was charged to account");
			}
			
			
			
			Account PA = new PersonalAcct(bal, FN, LN, str, C, S, Z);
			System.out.println(Cust.toString() + PA.toString());
			
		}
		}
		
		
		
		while(action.equalsIgnoreCase("Q") || (action.equalsIgnoreCase("Quit")));
	}
	
}
