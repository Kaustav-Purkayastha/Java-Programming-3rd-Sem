//Program to search a number from the given list.

import java.util.Scanner;

class Program6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter "+ size + " numbers: ");
		for(i=0; i<size; i++)
			arr[i] = sc.nextInt();
		System.out.println("The Entered Array is: ");
		for(i=0; i<size; i++)
			System.out.print(arr[i]+ " ");
		System.out.println("\nEnter the element to be searched: ");
		int search = sc.nextInt();
		for(i=0; i<size; i++)
		{
			if(arr[i] == search)
			{
				System.out.println(search+ " is present at location "+ (i+1));
				return;
			}
		}
		System.out.println(search+ " is not present in the array!");
	}
}