//Program to count the number of characters, words and lines in a file.

import java.io.*;
import java.util.*;

class Program19 {
	public static void main(String args[]) throws Exception {
		int char_count = 0, word_count = 0, line_count = 0;
		String s, fname;
		Scanner stdin = new Scanner(System.in);
		System.out.println("Enter the name of the file to display: ");
		fname = stdin.nextLine();
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
			System.out.println("Characters: " + char_count);
			System.out.println("Words: " + word_count);
			System.out.println("Lines: " + line_count);
			f.close();
		} catch (Exception e) {
			System.out.println("Source fiel not found!");
		}
	}
}