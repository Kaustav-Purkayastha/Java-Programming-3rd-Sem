// By - Kaustav Purkayastha ( Gurucharan University, Silchar - @ Department of Computer Science )

// 15. Write a Java program to implement an interface in the program.


interface Printing {
	void print();
}

public class InterfaceImplement {
	// Implementing print method from interface
	public void print() {
		System.out.println("Implementation of an interface: ");
	}

	public static void main(String args[]) {
		// Creating object of InterfaceImplement
		InterfaceImplement obj = new InterfaceImplement();

		// Calling print method
		obj.print();
	}
}