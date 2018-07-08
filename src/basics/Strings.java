package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "Lord of the Rings";
		
		
		// Ελέγχει αν το string περιέχει μια λέξη
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
		}

		
		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is Chrome");			
		}
		
		String firstName = "Erm";
		String lastName = "Ben";
		String SSN = "984162168";
		
		System.out.println("There are " + SSN.length() + " digits in your SSN.\n");
		
		// Print the initials plus four digits of SSN
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 3));
		System.out.println(SSN.substring(5));
	}

}
