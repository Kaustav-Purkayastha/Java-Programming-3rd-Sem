//Program to sort a list of numbers in ascending and descending order.

import java.util.Scanner;

class Program7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the " + size + " numbers: ");
		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		System.out.println("\nThe Entered Array is: ");
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
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
		System.out.println("\n\nThe Entered Array in Ascending Order is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("\n\nThe Entered Array in Descending Order is: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
