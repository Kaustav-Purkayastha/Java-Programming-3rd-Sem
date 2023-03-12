// By - Kaustav Purkayastha ( Gurucharan University, Silchar - @ Department of Computer Science )

// 7. Write a Java program to sort a list of numbers in ascending and descending order.


import java.util.Scanner;

public class SortingNumbers {
	public static void main(String args[]) {
		// create scanner object for user input
		Scanner sc = new Scanner(System.in);
		
		// prompt user for number of inputs
		System.out.print("How many numbers do you want to enter: ");
		int size = sc.nextInt();
	
		// create array with user input size
		int arr[] = new int[size];
	
		// prompt user for input numbers
		System.out.print("Enter the " + size + " numbers: ");
		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
	
		// print the entered array
		System.out.println("\nThe Entered Array is: ");
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
	
		// sort the array in ascending order
		int temp = 0;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	
		// print the array in ascending order
		System.out.println("\n\nThe Entered Array in Ascending Order is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	
		// sort the array in descending order
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	
		// print the array in descending order
		System.out.println("\n\nThe Entered Array in Descending Order is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
