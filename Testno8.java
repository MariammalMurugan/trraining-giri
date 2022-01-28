package testing;

import java.util.Scanner;

public class Testno8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner object =new Scanner(System.in);
		
	System.out.println("Choose your option\n 1. Area of the circle \t\t2. Area of the rectangle \t\t3.Area of the triangle");
	int choice = object.nextInt();
	switch (choice)
	{
	case 1:
		double r;
		System.out.println("Enter r");
		r=object.nextInt();
		double result1;
		result1=3.14*r*r;
		System.out.println(result1);
		break;
	case 2:
		double l, w;
		System.out.println("Enter l&w");
		l=object.nextInt();
		w=object.nextInt();
		double result2;
		result2=l*w;
		System.out.println(result2);
		break;
	case 3:
		double b, h;
		System.out.println("Enter b&h");
		b=object.nextInt();
				h=object.nextInt();
		double result3;
		result3=0.5*b*h;
		System.out.println(result3);
		break;
		
	}
			
	

	}

}
