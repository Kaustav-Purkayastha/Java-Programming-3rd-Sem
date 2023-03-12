// By - Kaustav Purkayastha ( Gurucharan University, Silchar - @ Department of Computer Science )

// 16. Write a Java program to implement the concept of exception handling mechanism.


import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String args[]) {
		// Initialize variables
		Scanner sc = new Scanner(System.in);
		int x, y, z, a;
		// Get user input
		System.out.print("Enter two integer nos.: ");
		x = sc.nextInt();
		y = sc.nextInt();

		try {
			// Attempt to divide x by y
			z = x / y;
			System.out.println("z = " + z);
		} catch (ArithmeticException e) {
			// Handle arithmetic exception if division by zero occurs
			System.out.println(e);
		}

		// Perform addition operation
		a = x + y;
		System.out.println("a = " + a);
	}
}