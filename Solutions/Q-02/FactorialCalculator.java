// By - Kaustav Purkayastha ( Gurucharan University, Silchar - @ Department of Computer Science )

// 2. Write a Java program to find the factorial of an integer number.


import java.util.Scanner;  // Import Scanner class from java.util package

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a new Scanner object to read input from user

        // Prompt the user to enter an integer
        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();  // Read an integer input from the user

        int factorial = calculateFactorial(n);  // Calculate the factorial of the input using a helper method
        System.out.println("The factorial of " + n + " is: " + factorial);  // Display the factorial value to the user
    }

    // Helper method to calculate the factorial of an integer
    private static int calculateFactorial(int n) {
        int factorial = 1;  // Initialize the factorial to 1

        // Loop from 1 to n and multiply the current factorial value by the loop counter
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;  // Return the final factorial value
    }
}
