//Program to implement the concept of method overloading.

class Div {
	public int div(int a, int b) {
		return (a / b);
	}

	public int div(int a, int b, int c) {
		return ((a + b) / c);
	}
}

public class Program10 {
	public static void main(String args[]) {
		Div ob = new Div();
		System.out.println(ob.div(10, 2));
		System.out.println(ob.div(10, 2, 3));
	}
}
