// By - Kaustav Purkayastha ( Gurucharan University, Silchar - @ Department of Computer Science )

// 6. Write a Java program to search a number from the given list.


import java.util.Scanner;

public class SearchNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i;
		// Get input array size from user
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
	
		// Create an integer array of size 'size'
		int arr[] = new int[size];
	
		// Get array elements from user
		System.out.print("Enter "+ size + " numbers: ");
		for(i=0; i<size; i++)
			arr[i] = sc.nextInt();
	
		// Display entered array elements
		System.out.println("The Entered Array is: ");
		for(i=0; i<size; i++)
			System.out.print(arr[i]+ " ");
	
		// Get element to be searched from user
		System.out.print("\nEnter the element to be searched: ");
		int search = sc.nextInt();
	
		// Iterate through array to search for the element
		for(i=0; i<size; i++) {
			if(arr[i] == search) {
				System.out.println(search+ " is present at location "+ (i+1));
				return;
			}
		}
	
		// If element is not found, display appropriate message
		System.out.println(search+ " is not present in the array!");
	}	
}