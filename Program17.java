//Program to create your own exception and use it in the program.

import java.util.Scanner;

class InvalidAgeException extends Exception {
	public InvalidAgeException(String str) {
		super(str);
	}
}

public class Program17 {
	static void validate(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException("Age is not valid to vote!");
		else
			System.out.println("Welcome to vote!");
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int z = sc.nextInt();
		try {
			validate(z);
		} catch (InvalidAgeException e) {
			System.out.println("Exception occurred: " + e);
		}
	}
}