// By - Kaustav Purkayastha ( Gurucharan University, Silchar - @ Department of Computer Science )

/* 9. Write a Java program to create a class Distance which consists of two coordinates as data members and a constructor which 
initializes the values of coordinates and a method which calculates the distance between two coordinates. */


public class Distance {
	// member variables to store the coordinates
	double x1, y1, x2, y2;
	// parameterized constructor to initialize the coordinates
	Distance(double a, double b, double c, double d) {
		x2 = a;
		y2 = b;
		x1 = c;
		y1 = d;
	}

	// method to calculate the distance between the coordinates
	void calculate() {
		double d = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
		System.out.println("The distance between both the coordinates is: " + d);
	}

	// main method to create object and call the calculate method
	public static void main(String args[]) {
		// create object with initial coordinates
		Distance d1 = new Distance(9.4, 5.9, 4.2, 2.6);
		// calculate the distance between the coordinates
		d1.calculate();
	}
}