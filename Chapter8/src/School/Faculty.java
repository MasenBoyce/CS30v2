package School;
public class Faculty extends UEmployee
{
	private String Department;

		
	
	
	public Faculty(String Fname, String Lname, String D, double PR) 
	{
		super(Fname, Lname, PR);
		Department = D;

		
	}
	
	
	
	public String toString() 
	{
		return(super.toString() + "\nFaculty Department: " + Department);
	}
}

