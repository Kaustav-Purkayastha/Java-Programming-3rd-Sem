// By - Kaustav Purkayastha ( Gurucharan University, Silchar - @ Department of Computer Science )

// 19. Write a Java program to count the number of characters, words and lines in a file.


import java.io.*;
import java.util.*;

public class FileCharacterCounting {
	public static void main(String args[]) throws Exception {
		int char_count = 0, word_count = 0, line_count = 0;
		String s, fname;
		Scanner sc = new Scanner(System.in);
		// Prompt user to enter the name of the file
		System.out.print("Enter the name of the file to display: ");
		fname = sc.nextLine();
		
		StringTokenizer st;
		try {
			BufferedReader f = new BufferedReader(new FileReader(fname));
			while ((s = f.readLine()) != null) {
				line_count++;
				String words[] = s.split(" ");
				word_count += words.length;
				st = new StringTokenizer(s, ",:.;");
				while (st.hasMoreTokens()) {
					s = st.nextToken();
					char_count += s.length();
				}
			}
			// Print the results
			System.out.println("Characters: " + char_count);
			System.out.println("Words: " + word_count);
			System.out.println("Lines: " + line_count);
			f.close();
		} catch (Exception e) {
			System.out.println("Source file not found!");
		}
	}
}