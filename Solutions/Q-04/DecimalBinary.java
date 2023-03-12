// By - Kaustav Purkayastha ( Gurucharan University, Silchar - @ Department of Computer Science )

// 4. Write a Java program to convert a decimal to its equivalent binary number.


import java.util.Scanner;

public class DecimalBinary {
	
	// Method to convert decimal to binary
	static void ConvertToBin(int n) {
		
		// Array to store binary digits
		int arr[] = new int[100];
		int i = 0;
		
		// Convert decimal to binary by dividing by 2 and storing remainders in array
		while (n > 0) {
			arr[i] = n % 2;
			n = n / 2;
			i++;
		}
		
		// Print binary digits in reverse order
		System.out.print("\nBinary: ");
		for (int j = i - 1; j >= 0; j--)
			System.out.print(arr[j]);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Decimal No.: ");
		int num = sc.nextInt();
		System.out.println("\nDecimal: " + num);
		
		// Call method to convert decimal to binary and print the result
		ConvertToBin(num);
	}
}
