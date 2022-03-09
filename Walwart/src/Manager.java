
public class Manager extends Employee 
{

	double yearlySalary;
	
	public Manager(String fn, String ln, double sal) //constructor method
	{
		super(fn, ln);
		yearlySalary = sal;
	}
	public double pay(double weeks)
	{
		double payEarned;
		payEarned = yearlySalary / 52 * weeks;
		
		return payEarned;
	}
	
	public String toString()
	{
		return(super.toString() + " Salary: " + yearlySalary);
	}
}
