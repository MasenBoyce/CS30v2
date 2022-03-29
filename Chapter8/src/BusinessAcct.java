
public class BusinessAcct extends Account 
{
	private double minBal = 500;
	
	
	
	public BusinessAcct(double bal, String fName, String lName, String str, String city, String st, String zip) 
	{
		super(bal, fName, lName, str, city, st, zip);
		
		
		
		if (bal < minBal) 
		{
			bal = bal - 10;
		}
	}
}
