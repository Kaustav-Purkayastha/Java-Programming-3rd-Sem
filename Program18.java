//Program to read the contents of a file.

import java.io.*;

class Program18 {
	public static void main(String[] args) throws IOException {
		File file = new File("testfile.txt");
		if (!file.exists()) {
			file.createNewFile();
		}
		FileReader fr = new FileReader(file);
		BufferedReader f = new BufferedReader(fr);
		int i = 0;
		while ((i = f.read()) != -1) {
			System.out.println((char) i);
		}
		f.close();
	}
}