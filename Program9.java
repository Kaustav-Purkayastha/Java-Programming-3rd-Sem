/*Program to create a class Distance which consists of two coordinates as data members and a constructor which 
initializes the values of coordinates and a method which calculates the distance between two coordinates.*/

class Distance {
	double x1, y1, x2, y2;

	Distance(double a, double b, double c, double d) {
		x2 = a;
		y2 = b;
		x1 = c;
		y1 = d;
	}

	void calculate() {
		double d = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
		System.out.println("The distance between both the coordinates is: " + d);
	}
}

public class Program9 {
	public static void main(String args[]) {
		Distance d1 = new Distance(9.4, 5.9, 4.2, 2.6);
		d1.calculate();
	}
}