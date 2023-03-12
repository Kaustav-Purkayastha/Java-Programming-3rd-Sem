// By - Kaustav Purkayastha ( Gurucharan University, Silchar - @ Department of Computer Science )

// 13. Write a Java program to implement the concept of multilevel inheritance.


class A {
	int i;
	// Constructor of class A
	A(int x) {
		i = x;
	}

	// Method to display the value of i
	void show() {
		System.out.println("Value of i is: " + i);
	}
}

// Class B extends class A
class B extends A {
	int j;
	// Constructor of class B
	B(int x, int y) {
		super(x);
		j = y;
	}

	// Method to display the values of i and j
	void display() {
		System.out.println("Value of i is: " + super.i);
		System.out.println("Value of j is: " + j);
	}
}

// Class C extends class B
class C extends B {
	int k;
	// Constructor of class C
	C(int x, int y, int z) {
		super(x, y);
		k = z;
	}

	// Method to display the values of i, j and k
	void print() {
		System.out.println("Value of i is: " + super.i);
		System.out.println("Value of j is: " + super.j);
		System.out.println("Value of k is: " + k);
	}
}

// Main class
public class MultilevelInheritance {
	public static void main(String args[]) {
		// Create an object of class C and call its methods
		C ob = new C(5, 6, 7);
		ob.show();
		ob.display();
		ob.print();
	}
}