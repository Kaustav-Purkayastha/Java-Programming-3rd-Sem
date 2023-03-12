// By - Kaustav Purkayastha ( Gurucharan University, Silchar - @ Department of Computer Science )

// 12. Write a Java program to demonstrate the concept of boxing and unboxing.

// Java Program to Illustrate Sum of Odd Numbers using Autoboxing and Unboxing


import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxing {
	// Define a static method sumOfOddNumber which returns sum of odd integers in a List
	public static int sumOfOddNumber(List<Integer> list) {
		int sum = 0;
		for (Integer i : list) {

			// Autoboxing of i automatically
			if (i % 2 != 0)
				sum += i;

			// Unboxing of i is done
			// using intvalue implicitly
			if (i.intValue() % 2 != 0)
				sum += i.intValue();
		}
		return sum;
	}

	// Define the main method
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			list.add(i);

		// Calculate sum of odd numbers in the list using sumOfOddNumber method
		int sumOdd = sumOfOddNumber(list);

		// Print the sum of odd numbers
		System.out.println("Sum of odd numbers: " + sumOdd);
	}
}
