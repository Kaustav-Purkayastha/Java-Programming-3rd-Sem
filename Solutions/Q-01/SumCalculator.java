// By - Kaustav Purkayastha ( Gurucharan University, Silchar - @ Department of Computer Science )

// 1. Write a Java program to find the sum of any number of integers entered as command line arguments.


public class SumCalculator {
    public static void main(String[] args) {
        int sum = 0;  // Initialize the sum to 0

        // Iterate through each command line argument
        for (int i = 0; i < args.length; i++) {
            try {
                // Attempt to parse the argument as an integer
                int num = Integer.parseInt(args[i]);
                sum += num;  // Add the parsed integer to the sum
            } catch (NumberFormatException e) {
                // Ignore non-integer arguments
            }
        }

        // Display the final sum to the user
        System.out.println("The sum of the entered integers is: " + sum);
    }
}


