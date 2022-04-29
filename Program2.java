//Program to find the factorial of a given integer number.

import java.util.Scanner;

class Program2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n, i, fact = 1;
		System.out.println("Enter an integer no.: ");
		n = sc.nextInt();
		for (i = 1; i <= n; i++)
			fact = fact * i;
		System.out.println("The factorial of the given integer number is: " + fact);
	}
}