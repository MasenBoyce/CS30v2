package School;
public class Staff extends UEmployee 
{
	private String Job;
	
	
	
	public Staff(String Fname, String Lname, String J, double PR) 
	{
		super(Fname, Lname, PR);
		Job = J;
	}

	
	
	public String toString() 
	{
		return(super.toString() + "\nStaff Job Title: " + Job + "\nSalary: ");
	}
}

