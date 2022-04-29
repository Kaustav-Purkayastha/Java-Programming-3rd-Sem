//Program to find the sum of any number of integers entered as command line arguments.


public class Program1 
{
	public static void main(String[] args) 
	{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = x + y;
		System.out.println("The Sum is: "+z);
	}

}
