//Program to check if a number is prime or not, by taking the number as input from the keyboard.

import java.util.Scanner;

class Program5 {
	public static boolean Prime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = s.nextInt();
		if (Prime(n))
			System.out.println(n + " is a prime number");
		else
			System.out.println(n + " is not a prime number");
	}
}