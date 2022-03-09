package exercise1;

import java.util.Scanner;

public class Unitester {

	public static UEmployee assign() {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter employees first name");
		String Fn = input.next();
		
		System.out.println("Enter employees last name");
		String Ln = input.next();
		
		System.out.println("Enter employees salary");
		double Sal = input.nextDouble();
		
		System.out.println("Enter employee type: Faculty or Staff");
		String EmpType;
		EmpType = input.next();
		
		
		if(EmpType.equalsIgnoreCase("F")) {
			
			System.out.println("Enter Department name:");
			String D = input.next();
			
			return new Faculty(Fn, Ln, Sal, D);
		}
		else
		{
			
			System.out.println("Enter job title");
			String Job = input.next();
			return new Staff(Fn, Ln, Sal, Job);
			
		}
		
	}	
	
}
