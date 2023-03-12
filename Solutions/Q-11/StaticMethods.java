// By - Kaustav Purkayastha ( Gurucharan University, Silchar - @ Department of Computer Science )

// 11. Write a Java program to show the uses of static data members and static methods.


// This class represents a Student
class Student {
	String name;
	int rollNo;
	static String cllgName; // static variable to store college name
	static int counter = 0; // static variable to assign unique roll numbers to students
	
	// constructor to initialize the student name and roll number
	public Student(String name) {
		this.name = name;
		this.rollNo = setRollNo(); // set unique roll number
	}

	// static method to increment the counter and return the roll number
	static int setRollNo() {
		counter++;
		return counter;
	}

	// static method to set the college name
	static void setCllg(String name) {
		cllgName = name;
	}

	// method to print the student information
	void getStudentInfo() {
		System.out.println("Name : " + this.name);
		System.out.println("Roll No. : " + this.rollNo);
		System.out.println("College Name : " + cllgName);
	}
}

public class StaticMethods {
	public static void main(String args[]) {
		Student.setCllg("XYZ"); // set college name
		Student s1 = new Student("Ram"); // create student object
		Student s2 = new Student("Sham"); // create student object
		s1.getStudentInfo(); // print student information
		s2.getStudentInfo(); // print student information
	}
}