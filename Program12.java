//Program to demonstrate the concept of boxing and unboxing.

// Java Program to Illustrate Sum of Odd Numbers
// using Autobxing and Unboxing

import java.io.*;
import java.util.*;

class Program12 {

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

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			list.add(i);
		int sumOdd = sumOfOddNumber(list);
		System.out.println("Sum of odd numbers: " + sumOdd);
	}
}
