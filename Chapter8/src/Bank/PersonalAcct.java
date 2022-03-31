package Bank;
public class PersonalAcct extends Account 
{
	private double Bal;
	
	
	
	public PersonalAcct(double bal, String fName, String lName, String str, String city, String st, String zip) 
	{
		super(bal, fName, lName, str, city, st, zip);
		
		Bal = bal;
	}
	
	
	
	public String toString() 
	{
		return("Balance: $" + Bal);
	}
}

