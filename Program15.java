//Program to implement an interface in the program.

interface Printing {
	void print();
}

class Program15 {
	public void print() {
		System.out.println("Implementation of an interface: ");
	}

	public static void main(String args[]) {
		Program15 obj = new Program15();
		obj.print();
	}
}