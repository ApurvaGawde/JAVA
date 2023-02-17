package LabAbstraction;

public class KidUsers implements LibraryUser{

	public void registerAccount(int age) {
		if(age < 12) {
			System.out.println("You have successfully registered under kids section");
		}
		else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
		
	}

	public void requestBook(String bookType) {
		if(bookType == "kids") {
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only kids book");
		}
		
	}
	

}
