// By - Kaustav Purkayastha ( Gurucharan University, Silchar - @ Department of Computer Science )

// 14. Write a Java program to create your own package and use it in your own program.


// Importing the packagetest class from the OwnPackage package
import OwnPackage.packagetest;

// Main class
public class UseOwnPackage {
	public static void main(String args[]) {
		// Creating an object of packagetest
		packagetest p = new packagetest();

		// Calling the display method of packagetest
		p.display();
	}
}