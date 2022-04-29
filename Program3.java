//Program to convert a binary to its equivalent decimal number.

import java.util.Scanner;
import java.io.*;

class Program3 {
	static int ConvertToDec(int binary) {
		int decimal = 0;
		int n = 0;
		while (true) {
			if (binary == 0)
				break;
			else {
				int temp = binary % 10;
				decimal += temp * Math.pow(2, n);
				binary = binary / 10;
				n++;
			}
		}
		return decimal;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Binary No.: ");
		int num = sc.nextInt();
		System.out.println("\nBinary: " + num);
		int z = ConvertToDec(num);
		System.out.println("\nDecimal: " + z);
	}
}