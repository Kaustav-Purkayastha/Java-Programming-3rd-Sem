// By - Kaustav Purkayastha ( Gurucharan University, Silchar - @ Department of Computer Science )

// 5. Write a Java program to check if a number is prime or not, by taking the number as input from the keyboard.


import java.util.Scanner;

public class CheckPrime {

	// Function to check whether a given number is prime or not
	public static boolean isPrime(int n) {
		// If number is less than or equal to 1, it's not a prime number
		if (n <= 1)
			return false;
		
		// Iterate from 2 to n/2 and check if there is any factor
		for (int i = 2; i <= n/2; i++) {
			if (n % i == 0) // If a factor is found, number is not prime
				return false;
		}
		// If no factor is found, number is prime
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer number: ");
		int n = sc.nextInt();
		
		if (isPrime(n)) {
			System.out.println(n + " is a prime number");
		} else {
			System.out.println(n + " is not a prime number");
		}
	}
}
