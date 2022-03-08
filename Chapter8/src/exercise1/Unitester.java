package exercise1;

import java.text.NumberFormat;
import java.util.Scanner;

public class Unitester {

	public static void main(String[] args) {
		
		Faculty emp1 = new Faculty("Dean", "Keaton", (double) 150, "Software Developer");
		Staff emp2 = new Staff("Micheal", "McManus", (double) 600, "Professor");
		UEmployee emp3 = new UEmployee("Todd", "Hockney", (double) 2000);
		
	
		Scanner input = new Scanner(System.in);
	
				
		String action; 
		int EmpNumber;
		Double PayRate;
	
		
		UEmployee emp = emp1;
		do {
		System.out.println("\nEmployee\\Pay\\Quit");
		System.out.println("Enter Choice: ");
		action = input.next();
		
		
		if (!action.equalsIgnoreCase("Q")) {
			System.out.println("Enter Employee Number 1, 2 or 3: ");
			EmpNumber = input.nextInt();
			switch(EmpNumber) {
			
			case 1: emp = emp1;break;
			case 2: emp = emp2;break;
			case 3: emp = emp3;break;	
			}
		if(action.equalsIgnoreCase("E")); {
			System.out.println("emp");
		    }
		}
		else if(action.equalsIgnoreCase("p")) {
			System.out.println("");
			PayRate = input.nextDouble();
		//	payEmployee(emp, PayRate);
	     }
		}
	   while(!action.equalsIgnoreCase("Q"));
	
	
	
	
	
	
	
}
