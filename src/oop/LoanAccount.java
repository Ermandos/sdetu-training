package oop;

public class LoanAccount implements IRate {

	public void setRate() {
		System.out.println("Setting rate");
		
	}

	public void increaseRate() {
		System.out.println("Increase rate");
		
	}
	
	public void setTerm(int term) {
		System.out.println("Setting the term to: " + term + " years.");
		
	}
	public void setAmmortSchedule() {
		System.out.println("Amortization schedule");
		
	}
}
