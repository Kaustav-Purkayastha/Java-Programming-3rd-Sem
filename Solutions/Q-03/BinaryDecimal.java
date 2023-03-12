// By - Kaustav Purkayastha ( Gurucharan University, Silchar - @ Department of Computer Science )

// 3. Write a Java program to convert a binary to its equivalent decimal number.


import java.util.Scanner;

public class BinaryDecimal {
    // Method to convert a binary number to decimal
    static int ConvertToDec(int binary) {
        int decimal = 0;  // Initialize the decimal value to 0
        int n = 0;  // Initialize the exponent to 0
        while (true) {
            // Check if the binary number has been completely converted
            if (binary == 0)
                break;
            else {
                // Get the last digit of the binary number and add its decimal value
                int temp = binary % 10;
                decimal += temp * Math.pow(2, n);
                binary = binary / 10;  // Remove the last digit from the binary number
                n++;  // Increment the exponent
            }
        }
        return decimal;  // Return the decimal value
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary No.: ");
        int num = sc.nextInt();
        System.out.println("\nBinary: " + num);
        int z = ConvertToDec(num);  // Convert the binary number to decimal
        System.out.println("\nDecimal: " + z);
    }
}
