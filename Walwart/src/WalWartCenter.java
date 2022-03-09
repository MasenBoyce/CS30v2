import java.text.NumberFormat;
import java.util.Scanner;

public class WalWartCenter 
{
	public static void payEmployee(Employee emp, double payArg) 
	{
		NumberFormat money = NumberFormat.getCurrencyInstance();
		double pay;
		
		System.out.println(emp);
		pay = emp.pay(payArg);
		
		System.out.println(money.format(pay));
	}
	
	
	public static void main(String[] Args) 
	{
		Manager emp1 = new Manager("Steve", "Smith", 70000);
		Associate emp2  = new Associate("Bill", "Ali", 15.00);
		
		Scanner input = new Scanner(System.in);
		
		String action;
		int empNum;
		double payArg;
		
		do 
		{
			System.out.println("/n Employee // Pay // Quit");
			System.out.println("Enter Choice: ");
			action = input.next();
			
			if(!action.equalsIgnoreCase("Q"))
					{
						System.out.println("Enter employee number(1 or 2): ");
						empNum = input.nextInt();
						
						
						switch(empNum)
						{
							case 1 : emp = emp1; break;
							case 2: emp = emp2; break;
						}
						
						if(action.equalsIgnoreCase("E"))
						{
							System.out.println(emp);
						}
						
						else if(action.equalsIgnoreCase("P"))
						{
							System.out.println("Enter hours for Associate or pay period for manager: ");
							payArg = input.nextDouble();
							
							payEmployee(emp, payArg);
						}
					}
		} while(!action.equalsIgnoreCase("Q"));
		
	}
}
