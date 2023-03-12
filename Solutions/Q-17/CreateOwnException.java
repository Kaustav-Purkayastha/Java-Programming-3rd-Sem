// By - Kaustav Purkayastha ( Gurucharan University, Silchar - @ Department of Computer Science )

// 17. Write a Java program to create your own exception and use it in the program.


import java.util.Scanner;

// Custom exception class that extends Exception
class InvalidAgeException extends Exception {
	
	// Constructor that accepts an error message
	public InvalidAgeException(String str) {
		super(str);
	}
}

public class CreateOwnException {
	
	// A method that throws the custom exception if age is less than 18
	static void validate(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException("Age is not valid to vote!");
		else
			System.out.println("Welcome to vote!");
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age: ");
		int z = sc.nextInt();
		
		try {
			validate(z); // Call the method that may throw the custom exception
		} catch (InvalidAgeException e) { // Catch the custom exception
			System.out.println("Exception occurred: " + e);
		}
	}
}
