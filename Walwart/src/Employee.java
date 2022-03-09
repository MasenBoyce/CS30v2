public abstract class Employee 
{

	private String firstname;
	private String lastname;
	
	public Employee(String fn, String ln) //constructor method
	{
		firstname = fn;
		lastname = ln;
	}
	
	public String toString() //prints Employee object
	{
		return(firstname + " " + lastname);
	}
	
	abstract double pay(double period);
	
	
}
