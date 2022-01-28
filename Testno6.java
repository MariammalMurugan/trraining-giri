package testing;

import java.util.Scanner;

public class Testno6 {
	public static void  main(String[] args)
	{
		int mark;
		mark=10;
		Scanner obj1= new Scanner (System.in);
		System.out.println("Enter marks");
		mark=obj1.nextInt();
		
	if(mark==100)
	
	{
		System.out.println("Grade: A+");
	}
	else if (mark<100 && mark>95)
	{
		System.out.println("Grade:A");
	}
	else if (mark<100 && mark>80)
	{
		System.out.println(" Grade: B+");
	}
	else if (mark<100 && mark>75)
	{
		System.out.println(" Grade: B");
	}
	else if (mark<100 && mark<75)
	{
		System.out.println(" Grade: F");
	}
	}


}
	