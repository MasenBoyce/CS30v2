package School;
abstract class UEmployee 
{
	private String FN, LN;
	private double PayRate;
	
	
	
	
	public UEmployee(String Fname, String Lname, double PR) //constructor class (creates an employee)
	{	
		FN = Fname;
		LN = Lname;
		PayRate = PR;
		
	}
	
	
	
	public String toString() //returns employees name
	{
		return("Employee name: " + FN + " " + LN + "\nSalary: $" + PayRate);
	}
}
