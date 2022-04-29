//Program to implement the concept of multilevel inheritance.

class A {
	int i;

	A(int x) {
		i = x;
	}

	void show() {
		System.out.println("Value of i is: " + i);
	}
}

class B extends A {
	int j;

	B(int x, int y) {
		super(x);
		j = y;
	}

	void display() {
		System.out.println("Value of i is: " + super.i);
		System.out.println("Value of j is: " + j);
	}
}

class C extends B {
	int k;

	C(int x, int y, int z) {
		super(x, y);
		k = z;
	}

	void print() {
		System.out.println("Value of i is: " + super.i);
		System.out.println("Value of j is: " + super.j);
		System.out.println("Value of k is: " + k);
	}
}

class Program13 {
	public static void main(String args[]) {
		C ob = new C(5, 6, 7);
		ob.show();
		ob.display();
		ob.print();
	}
}