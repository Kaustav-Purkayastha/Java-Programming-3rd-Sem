//Program to convert a decimal to its equivalent binary number.

import java.util.Scanner;
import java.io.*;

class Program4
{
	static void ConvertToBin(int n)
	{
		int arr[] = new int[100];
		int i = 0;
		while(n>0)
		{
			arr[i] = n%2;
			n = n/2;
			i++;
		}
		System.out.println("\nBinary: ");
		for(int j=i-1; j>=0; j--)
			System.out.print(arr[j]+ " ");
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Decimal No.: ");
		int num = sc.nextInt();
		System.out.println("\nDecimal: "+ num);
		ConvertToBin(num);
	}
}	