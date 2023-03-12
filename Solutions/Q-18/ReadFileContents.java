// By - Kaustav Purkayastha ( Gurucharan University, Silchar - @ Department of Computer Science )

// 18. Write a Java program to read the contents of a file.


import java.io.*;

public class ReadFileContents {
	public static void main(String[] args) throws IOException {
		// Create a file object
		File file = new File("testfile.txt");

		// Check if file exists or not, if not create a new file
		if (!file.exists()) {
			file.createNewFile();
		}

		// Create a FileReader object to read the file
		FileReader fr = new FileReader(file);

		// Create a BufferedReader object to read the file line by line
		BufferedReader f = new BufferedReader(fr);

		int i = 0;

		// Read the file line by line and print its content on console
		while ((i = f.read()) != -1) {
			System.out.println((char) i);
		}

		// Close the BufferedReader
		f.close();
	}
}