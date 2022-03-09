package exercise1;




public class UEmployee {

	private String firstName, lastName;
	@SuppressWarnings("unused")
	private Double Salary; 
	
	
	public UEmployee(String Fn, String Ln, Double Sal) {
		
		firstName = Fn;
		lastName = Ln; 
		Salary = Sal;
		
	}
	
	
	
	public String toString() {
		return (firstName + " " + lastName);
	
  }
}