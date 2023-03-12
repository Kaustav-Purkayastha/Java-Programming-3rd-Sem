// By - Kaustav Purkayastha ( Gurucharan University, Silchar - @ Department of Computer Science )

// 10. Write a Java program to implement the concept of method overloading.


class Div {
	// Div class with method div which takes two integers as arguments and returns their quotient
	public int div(int a, int b) {
		return (a / b);
	}
	// Div class with method div which takes three integers as arguments and returns their sum's quotient
	public int div(int a, int b, int c) {
		return ((a + b) / c);
	}
}

public class MethodOverloading {
	public static void main(String args[]) {
		Div ob = new Div();
		System.out.println(ob.div(10, 2)); // invokes div method with two arguments
		System.out.println(ob.div(10, 2, 3)); // invokes div method with three arguments
	}
}
