package testing;

import java.util.Scanner;

public class Testno7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val1, val2, result;
		Scanner object =new Scanner(System.in);
		System.out.println("enter value for val1");
		val1=object.nextInt();
		System.out.println("enter value for val2");
		val2=object.nextInt();
	System.out.println("Choose your option\n 1. Addition \t\t2. Sub \t\t3. Mul\t\t4. Div");
	int choice = object.nextInt();
	switch (choice)
	{
	case 1:
		result=val1+val2;
		System.out.println(result);
		break;
	case 2:
		result=val1-val2;
		System.out.println(result);
		break;
	case 3:
		result=val1*val2;
		System.out.println(result);
	case 4:
		result=val1/val2;
		System.out.println(result);
		break;
		
	}
			
	
	
	
	
	}

}
