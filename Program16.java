//Program to implement the concept of exception handling mechanism.

import java.util.Scanner;
import java.io.*;

class Program16 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x, y, z, a;
		System.out.println("Enter two integer nos.: ");
		x = sc.nextInt();
		y = sc.nextInt();
		try {
			z = x / y;
			System.out.println("z = " + z);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		a = x + y;
		System.out.println("a = " + a);
	}
}