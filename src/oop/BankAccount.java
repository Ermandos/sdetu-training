package oop;

public class BankAccount implements IRate {
	// Define variables
	String accountNumber;
	
	// Static >> belongs to the CLASS not the object instance
	//Final >> constant (often static and final go together)
	private static final String routingNumber = "013546";
	
	// Instance variables
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	// Constructor definitions: unique methods
	// 1. They are used to define / setup / initialize properties of an object
	// 2. Constructors are IMPLICITLY called upon INSTANTIATION
	// 3. The same name as the class itself
	// 4. Constructors have NO return type
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	// Overloading: call same method name with different arguments
	BankAccount(String accountType) {
		System.out.println("NEW ACCOUNT: " + accountType);
	}

	BankAccount(String accountType, double initDeposit) {
		// initDeposit, accountType, and Msg are all local variables
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: US$" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "ERROR: Minimum deposoit must be at least US$1,000";
			
		}
		else {
			Msg = "Thanks for your initial deposit of: US$" + initDeposit;
		}
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	// Getters / Setters
	
	// Allow the user to define the name
	public void setName(String name) {
		this.name = "Mr. " + name;
	}
	public String getName() {
		return name;
	}
	
	
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	// Interface methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	public void increaseRate() {
		System.out.println("INCREASING RATE");
	}
	
	// Define methods
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	// Private : can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity);
		System.out.println("YOUR NEW BALANCE IS: US$" + balance);
	}
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	
	void getStatus() {
		
	}
	// Override
	public String toString() {
		return "[ NAME: " + name + ". ACCOUNT#" + accountNumber + ". ROUTING #" + routingNumber + ". BALANCE: US$" + balance + " ]";
	}
}
