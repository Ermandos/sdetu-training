package basics;

public class SalaryCalculator {

	public static void main(String[] args) {
		
		//  VARIABLES
		
		// Let's create a variable to define our career
		
		// Declare a Variable
		String career;
		System.out.println("Program is starting");
		
		// Defined a Variable
		career = "Software Developer";
		System.out.println("My career is: " + career);
		
		// Declare and Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		career = "Web Developer";
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + " at the rate of " +  rate + " per hour is US$" + salary + " per Year.");
		
		// Compute our annual salary
		// rate * hoursPerWeek * weeksPerYear 
		

	}

}
