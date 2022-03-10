package exercise1;




public class UEmployee {

	private String firstName, lastName;
	private int Salary; 
	
	
	public UEmployee(String Fn, String Ln, int Sal) {
		
		firstName = Fn;
		lastName = Ln; 
		Salary = Sal;
		
	}
	
	
	
	public String toString() {
		return (firstName + " " + lastName + " $" + Salary);
	
  }
}