//Program to show the uses of static data members and static methods.

class Student {
	String name;
	int rollNo;
	static String cllgName;
	static int counter = 0;

	public Student(String name) {
		this.name = name;
		this.rollNo = setRollNo();
	}

	static int setRollNo() {
		counter++;
		return counter;
	}

	static void setCllg(String name) {
		cllgName = name;
	}

	void getStudentInfo() {
		System.out.println("Name : " + this.name);
		System.out.println("Roll No. : " + this.rollNo);
		System.out.println("College Name : " + cllgName);
	}
}

public class Program11 {
	public static void main(String args[]) {
		Student.setCllg("XYZ");
		Student s1 = new Student("Ram");
		Student s2 = new Student("Sham");
		s1.getStudentInfo();
		s2.getStudentInfo();
	}
}