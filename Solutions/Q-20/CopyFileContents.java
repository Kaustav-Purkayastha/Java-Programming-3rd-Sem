// By - Kaustav Purkayastha ( Gurucharan University, Silchar - @ Department of Computer Science )

// 20. Write a Java program to copy the contents of one file into another file.


import java.io.*;
import java.util.*;

public class CopyFileContents {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		// Get the name of the source file.
		System.out.print("Provide source file name: ");
		String sourcefile = sc.next();

		// Get the name of the destination file.
		System.out.print("Provide destination file name: ");
		String destinationfile = sc.next();

		// Create file reader and writer objects.
		FileReader fileReader = new FileReader(sourcefile);
		FileWriter fileWriter = new FileWriter(destinationfile, true);

		int character;
		// Copy contents of the source file to destination file character by character.
		while ((character = fileReader.read()) != -1) {
			fileWriter.write(character);
		}

		System.out.println("Copy finished...");

		// Close the file reader and writer objects.
		fileReader.close();
		fileWriter.close();
	}
}